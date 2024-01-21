package co.com.demo.serenity.reto.stepdefinitions;

import co.com.demo.serenity.reto.models.DemoSerenityIsData;
import co.com.demo.serenity.reto.questions.Answer;
import co.com.demo.serenity.reto.tasks.Login;
import co.com.demo.serenity.reto.tasks.OpenUp;
import co.com.demo.serenity.reto.tasks.SessionUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user enters the page$")
    public void thatTheUserEntersThePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^enter the credentials$")
    public void enterTheCredentials(List<DemoSerenityIsData> demoSerenityIsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(demoSerenityIsData.get(0).getStrUser(),demoSerenityIsData.get(0).getStrPassword()));
    }

    @Then("^It validates that the user is on the main page$")
    public void itValidatesThatTheUserIsOnTheMainPage(List<DemoSerenityIsData> demoSerenityIsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(new SessionUser());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Answer.toThe(demoSerenityIsData.get(0).getStrUserSession())));
    }
}

