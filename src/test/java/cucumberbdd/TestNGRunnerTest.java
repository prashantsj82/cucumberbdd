package cucumberbdd;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html", "summary"},
        snippets= CAMELCASE,
        dryRun = false,
        monochrome=false,
     //   tags={"@smoke,@regression")
        glue= {"cucumberbdd.stepdefs", "cucumberbdd.hooks"},
        features = "src/test/resources/cucumberbdd"
        )
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}