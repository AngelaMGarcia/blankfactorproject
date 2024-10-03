package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SubscribePage extends PageObject {

    public static final Target NEWSLETTER_OPTION = the("Newsletter option").located(By.name("//*[@id=\"menu-item-1438450\"]"));
    public static final Target ENTER_EMAIL = the("Enter email").located(By.className("pencraft _emailInput_11q5m_23"));

    public static final Target BTN_SUBSCRIBE = the("Subscribe button").located(By.className("button rightButton primary subscribe-btn _button_11q5m_76"));

    public static final Target NEW_BTN_SUBSCRIPTION = the("Subscribe button").located(By.className("button rightButton primary subscribe-btn _button_11q5m_76"));


}
