package uk.nhsbsa.services;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","summary","html:target/cucumber"},
        features = "src/test/resources/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        tags = "@Test"

)


public class RunnerTest {
}
