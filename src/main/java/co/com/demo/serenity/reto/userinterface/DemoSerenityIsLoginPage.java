package co.com.demo.serenity.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoSerenityIsLoginPage {

    public static final Target INPUT_USER =
            Target.the("where do we write user").
                    located(By.id("LoginPanel0_Username"));

    public static final Target INPUT_PASSWORD =
            Target.the("where do we write password").
                    located(By.id("LoginPanel0_Password"));

    public static final Target LOGIN_BUTTON =
            Target.the("button that shows us the form to login").
                    located(By.id("LoginPanel0_LoginButton"));

    //Localizadores para realizar la question y validar que el usuario inicio sesion

    public static final Target ICON_PROFILE =
            Target.the("button that shows us the form to login").
                    located(By.xpath("//a[contains(@class, 's-user-profile-link')][1]"));

    public static final Target USER_SESSION =
            Target.the("button that shows us the form to login").
                    located(By.cssSelector("p.s-user-info"));


}

