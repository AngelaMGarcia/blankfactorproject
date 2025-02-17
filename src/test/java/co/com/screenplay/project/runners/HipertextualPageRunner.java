package co.com.screenplay.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
     features = "src/test/resources/features/hipertextualpage.feature",
     glue = "co.com.screenplay.project.stepdefinitions",
     snippets = CucumberOptions.SnippetType.CAMELCASE,
     tags = "@test1"
)
public class HipertextualPageRunner {
}
