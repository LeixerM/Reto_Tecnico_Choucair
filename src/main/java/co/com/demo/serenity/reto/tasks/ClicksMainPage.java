package co.com.demo.serenity.reto.tasks;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsCreateProductPage;
import co.com.demo.serenity.reto.userinterface.DemoSerenityIsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicksMainPage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoSerenityIsCreateProductPage.OPTION_NORTWHIND),
                Click.on(DemoSerenityIsCreateProductPage.OPTION_PRODUCT),
                Click.on(DemoSerenityIsCreateProductPage.BUTTON_NEW_PRODUCT)
        );
    }
}
