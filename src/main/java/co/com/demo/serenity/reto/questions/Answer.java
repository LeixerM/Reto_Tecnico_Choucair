package co.com.demo.serenity.reto.questions;

import co.com.demo.serenity.reto.userinterface.DemoSerenityIsCreateProductPage;
import co.com.demo.serenity.reto.userinterface.DemoSerenityIsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String sessionUser = Text.of(DemoSerenityIsLoginPage.USER_SESSION).viewedBy(actor).asString();
        if (question.equals(sessionUser)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }

    public static  Question<String> validateCreateProduct(){
        return actor -> DemoSerenityIsCreateProductPage.TEXT_PRODUCT.resolveFor(actor).getText().trim();
    }
}
