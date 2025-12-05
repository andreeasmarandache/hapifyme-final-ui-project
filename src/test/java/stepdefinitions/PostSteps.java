package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class PostSteps {

    @When("the user enters a postBody {string}")
    public void userEntersPostBody(String postBody) {
        homePage.enterPost(postBody);
    }

    @And("the user clicks on the post button")
    public void userClicksPostButton() {
        homePage.clickPostButton();
    }

    @Then("the first post shows Just now")
    public void firstPostJustNow() {
        homePage.verifyFirstPostJustNow();
    }

    @Then("the first post shows the correct body {string}")
    public void firstPostHasBody(String body) {
        homePage.verifyFirstPostBody(body);
    }

    HomePage homePage = new HomePage();
}
