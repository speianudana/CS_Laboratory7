package steps.search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.Google;

import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private Google googlePage;

    @When("Open google")
    public void openGooglePage() {
        googlePage = new Google();
    }

    @And("Search computer")
    public void searchComputer() {
        googlePage.writeInSearchBar("computer");
    }

    @Then("Title should contain Google word")
    public void checkTitleContainsGoogle() {
        Assert.assertTrue(googlePage.isContainingGoogle());
    }
}
