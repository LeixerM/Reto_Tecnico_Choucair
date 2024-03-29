package co.com.demo.serenity.reto.tasks;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Performable onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUser).into(DemoSerenityIsLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(DemoSerenityIsLoginPage.INPUT_PASSWORD),
                Click.on(DemoSerenityIsLoginPage.LOGIN_BUTTON)
        );
    }
}
