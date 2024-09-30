package co.com.screenplay.project.tasks;


import co.com.screenplay.project.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.screenplay.project.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SEARCH),
                Click.on(SEARCH),
                Enter.theValue(Data.Name).into(SEARCH),
                Scroll.to(ARTICLE),
                Click.on(ARTICLE)
                );


    }
    public static OpenThePage hipertextual(){
        return instrumented(OpenThePage.class);

    }
}
