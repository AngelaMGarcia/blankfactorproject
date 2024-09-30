package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.questions.VerificationArticle;
import co.com.screenplay.project.tasks.OpenThePage;
import co.com.screenplay.project.tasks.Subscribe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsString;

public class HipertextualPageStepDefinitions {

    @Managed(driver = "chrome")
   WebDriver driver;

    private Actor user  = Actor.named("Angela");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Angela");
        // Inicializar ChromeDriver


    }

    @Given("that Angela open the page")
    public void thaAngelaOpenThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://hipertextual.com/"));

    }

    @When("she search for steve jobs")
    public void sheSearchForSteveJobs() {
        theActorInTheSpotlight().attemptsTo(OpenThePage.hipertextual());


    }

    @Then("she should read the post")
    public void sheShouldReadThePost() {
      theActorInTheSpotlight().should(seeThat(VerificationArticle.verificationText(),Matchers.is(true)));
       theActorInTheSpotlight().should(seeThat(TheWebPage.currentUrl(), containsString("reed-jobs")));

    }

    @When("enter the newsletter option")
    public void enterTheNewsletterOption() {
        theActorInTheSpotlight().attemptsTo(Subscribe.on());

    }

    @Then("she should subscribe to the newsletter")
    public void sheShouldSubscribeToTheNewsletter() {

    }
}
