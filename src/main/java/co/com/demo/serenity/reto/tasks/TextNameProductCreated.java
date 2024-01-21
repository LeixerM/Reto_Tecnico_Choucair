package co.com.demo.serenity.reto.tasks;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsCreateProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class TextNameProductCreated implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoSerenityIsCreateProductPage.INPUT_SEARCH, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(DemoSerenityIsCreateProductPage.INPUT_SEARCH),
                WaitUntil.the(DemoSerenityIsCreateProductPage.INPUT_SEARCH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("PRODUCTO3").into(DemoSerenityIsCreateProductPage.INPUT_SEARCH)
        );
    }
}
