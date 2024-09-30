package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class VerificationUrl implements Question<String> {

    @Managed
    WebDriver driver;

    @Override
    @Subject("the current page URL")
    public String answeredBy(Actor actor) {
        return driver.getCurrentUrl(); // Obtiene la URL actual de la página
    }
    public static Question<String> currentUrl() {
        return new VerificationUrl();
    }
}
