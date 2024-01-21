package co.com.demo.serenity.reto.tasks;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsCreateProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.File;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SaveProduct implements Task {

   // private static String BaseImageRoute = "src/test/resources/images";
   // final Path baseImage = Paths.get(BaseImageRoute.concat("producto.jpg")).toAbsolutePath();

    File baseImage = new File("src/test/resources/images/producto.jpg");
    String path = baseImage.getAbsolutePath();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("PRODUCTO2").into(DemoSerenityIsCreateProductPage.NAME_PRODUCT),
                Enter.keyValues(path).into(DemoSerenityIsCreateProductPage.FILE_IMG),
                WaitUntil.the(DemoSerenityIsCreateProductPage.SELECT_PROVIDER, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(DemoSerenityIsCreateProductPage.SELECT_PROVIDER),
                Click.on(DemoSerenityIsCreateProductPage.SELECT_PROVIDER),
                Click.on(DemoSerenityIsCreateProductPage.INPUT_TEXT_PROVIDER),
                Enter.theValue("Bigfoot Breweries").into(DemoSerenityIsCreateProductPage.INPUT_TEXT_PROVIDER).thenHit(Keys.ENTER),
                Scroll.to(DemoSerenityIsCreateProductPage.SELECT_CATEGORY),
                Click.on(DemoSerenityIsCreateProductPage.SELECT_CATEGORY),
                Click.on(DemoSerenityIsCreateProductPage.INPUT_TEXT_CATEGORY),
                Enter.theValue("Condiments").into(DemoSerenityIsCreateProductPage.INPUT_TEXT_CATEGORY).thenHit(Keys.ENTER),
                Enter.theValue("5").into(DemoSerenityIsCreateProductPage.INPUT_QUANTITY_PER_UNIT),
                Enter.theValue("10,00").into(DemoSerenityIsCreateProductPage.INPUT_UNIT_PRICE),
                Enter.theValue("2").into(DemoSerenityIsCreateProductPage.INPUT_IN_STOCK),
                Enter.theValue("2").into(DemoSerenityIsCreateProductPage.INPUT_UNITS_ON_ORDER),
                Enter.theValue("2").into(DemoSerenityIsCreateProductPage.INPUT_REORDER_LEVEL),
                Click.on(DemoSerenityIsCreateProductPage.BUTTON_SAVE)
                );
    }
}
