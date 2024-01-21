package co.com.demo.serenity.reto.stepdefinitions;

import co.com.demo.serenity.reto.models.DemoSerenityIsData;
import co.com.demo.serenity.reto.questions.Answer;
import co.com.demo.serenity.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CreateProductStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Enter the credentials to enter the main page$")
    public void theUserIsOnTheMainPage(List<DemoSerenityIsData> demoSerenityIsData) {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage(), Login.onThePage(demoSerenityIsData.get(0).getStrUser(),demoSerenityIsData.get(0).getStrPassword()));
    }

    @When("^the user creates the product$")
    public void theUserCreatesTheProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(new ClicksMainPage());
        OnStage.theActorInTheSpotlight().attemptsTo(new SaveProduct());
    }

    @Then("^It validates that the product was created successfully$")
    public void itValidatesThatTheProductWasCreatedSuccessfully() {
        OnStage.theActorInTheSpotlight().attemptsTo(new TextNameProductCreated());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.validateCreateProduct()));
    }
}
