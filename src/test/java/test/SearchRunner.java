package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/GoogleSearch.feature",
        glue = {"steps/search"},
        stepNotifications = true,
        plugin = { "json:target/cucumber.json", "pretty", "html:target/header-test.html" }
)
public class SearchRunner {

}