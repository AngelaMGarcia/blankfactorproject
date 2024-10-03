package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage extends PageObject {

    public static final Target BTN_SEARCH = the("btn buscar").located(By.id("search-toggle"));
    public static final Target SEARCH = the("label de busqueda").located(By.id("search-form-2"));
    public static final Target ARTICLE = the("articulo").located(By.className("entry-title"));
    public static final Target VALIDATE_ARTICLE = the("articulo").located(By.className("newspack-post-subtitle"));


}
