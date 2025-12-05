package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProfilePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfileSteps {

    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    @When("the user clicks on the settings button")
    public void userClicksSettingsButton() {
        homePage.clickSettingsButton();
    }

    @And("the user updates first name {string}")
    public void userUpdatesFirstName(String firstName) {
        profilePage.updateFirstName(firstName);
    }

    @And("the user updates last name {string}")
    public void userUpdatesLastName(String lastName) {
        profilePage.updateLastName(lastName);
    }

    @And("the user clicks on the update details button")
    public void userClicksUpdateDetailsButton() {
        profilePage.clickUpdateDetailsButton();
    }

    @Then("the user should see the message {string}")
    public void userGetsMessageForUpdatedProfile(String expectedMessage) {
        $("body").shouldHave(text(expectedMessage));
    }

}
