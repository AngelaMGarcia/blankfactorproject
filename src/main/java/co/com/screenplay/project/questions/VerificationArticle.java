package co.com.screenplay.project.questions;

import co.com.screenplay.project.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificationArticle implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        boolean compare = HomePage.VALIDATE_ARTICLE.resolveFor(actor).getText().contains("Reed Jobs, hijo de Steve Jobs");
        return compare;
    }

    public static VerificationArticle verificationText(){
        return new VerificationArticle();
    }
}
