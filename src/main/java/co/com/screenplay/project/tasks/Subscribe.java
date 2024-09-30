package co.com.screenplay.project.tasks;

import co.com.screenplay.project.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static co.com.screenplay.project.userinterfaces.HomePage.ARTICLE;
import static co.com.screenplay.project.userinterfaces.SubscribePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Subscribe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEWSLETTER_OPTION),
                Scroll.to(ENTER_EMAIL),
                Click.on(ENTER_EMAIL),
                Enter.theValue(Data.Email).into(ENTER_EMAIL),
                Click.on(BTN_SUBSCRIBE));
              //  Switch.toNewWindow(NEW_BTN_SUBSCRIPTION));

    }

    public static Subscribe on() {
        return instrumented(Subscribe.class);

    }
}
