package co.com.screenplay.project;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hipertextualpage.feature",
        glue = "co.com.screenplay.project.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@test1"
)
public class HipertextualPageRunnerTest {
    @Test
    void test() {
        assertTrue(true);
    }

    @AfterClass
    public static void afterAll() {
        getDriver().quit();
    }
}
