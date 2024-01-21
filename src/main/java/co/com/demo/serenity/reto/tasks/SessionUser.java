package co.com.demo.serenity.reto.tasks;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SessionUser implements Task {

        private String sessionUser;

    public SessionUser() {
        this.sessionUser = sessionUser;
    }

    public static Performable the(String sessionUser) {
        return Tasks.instrumented(SessionUser.class,sessionUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoSerenityIsLoginPage.ICON_PROFILE, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(DemoSerenityIsLoginPage.ICON_PROFILE),
                Click.on(DemoSerenityIsLoginPage.ICON_PROFILE),
                WaitUntil.the(DemoSerenityIsLoginPage.USER_SESSION, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(DemoSerenityIsLoginPage.USER_SESSION)
        );
    }
}
