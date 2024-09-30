package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Switch implements Interaction {


    @Managed
    WebDriver driver;
 Set<String>    originalWindow = driver.getWindowHandles();
    Set<String> allWindows = driver.getWindowHandles();

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }


}
