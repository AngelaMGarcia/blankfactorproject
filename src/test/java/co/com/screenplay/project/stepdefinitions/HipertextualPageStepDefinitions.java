package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.questions.VerificationArticle;
import co.com.screenplay.project.tasks.OpenThePage;
import co.com.screenplay.project.tasks.Subscribe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;

public class HipertextualPageStepDefinitions {

    //@Managed(driver = "chrome")
    //WebDriver driver;

    private Actor user = Actor.named("Angela");

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("Angela");
        // Inicializar ChromeDriver


    }

    @Given("that {actor} open the page")
    public void thaAngelaOpenThePage(Actor actor) {
        actor.wasAbleTo(Open.url("https://hipertextual.com/"));
        new WaitUntilAngularIsReady();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("{actor} search for steve jobs")
    public void sheSearchForSteveJobs(Actor actor) {
        actor.attemptsTo(OpenThePage.hipertextual());


    }

    @Then("{actor} should read the post")
    public void sheShouldReadThePost(Actor actor) {
        actor.should(seeThat(VerificationArticle.verificationText(), Matchers.is(true)));
        actor.should(seeThat(TheWebPage.currentUrl(), containsString("reed-jobs")));

    }

    @When("{actor} enter the newsletter option")
    public void enterTheNewsletterOption(Actor actor) {
        actor.attemptsTo(Subscribe.on());

    }

    @Then("{actor} should subscribe to the newsletter")
    public void sheShouldSubscribeToTheNewsletter() {

    }
}
