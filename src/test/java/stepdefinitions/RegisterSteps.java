package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.TestData;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.junit.Assert.assertTrue;


public class RegisterSteps {

    LoginPage loginPage = new LoginPage();


    @And("the user clicks on the register link")
    public void userClicksOnRegisterLink(){
        loginPage.navigateToRegister();
    }

    @When("the user enters first name {string}")
    public void userEntersFirstNameToReg(String value){
        if (value.equalsIgnoreCase("random name")) {
            loginPage.enterFirstName(TestData.randomNames());
        } else {
            loginPage.enterFirstName(value);
        }
    }

    @And("the user enters last name {string}")
    public void userEntersLastNameToReg(String value){
        if (value.equalsIgnoreCase("random name")) {
            loginPage.enterLastName(TestData.randomNames());
        } else {
            loginPage.enterLastName(value);
        }
    }


    @And("the user enters email {string}")
    public void userEntersEmailToReg(String value) {
        if (value.equalsIgnoreCase("random email")) {
            loginPage.enterEmailForReg(TestData.randomEmail());
        } else {
            loginPage.enterEmailForReg(value);
        }
    }

    @And("the user enters password {string}")
    public void userEntersPasswordToReg(String value) {
        if (value.equalsIgnoreCase("random password")) {
            loginPage.enterPasswordForReg(TestData.randomPassword());
        } else {
            loginPage.enterPasswordForReg(value);
        }
    }

    @And("the user presses the register button")
    public void userClicksRegister() {
        loginPage.clickRegisterButton();
    }

    @Then("the user should see an success message {string}")
    public void userShouldSeeAnSuccessMessage(String expectedMessage) {
        loginPage.verifySuccessMessage(expectedMessage);
    }

    @Then("the required field should show the browser validation message {string}")
    public void requiredFieldShowsValidation(String ignored){
        String actualMessage = executeJavaScript(
                "return arguments[0].validationMessage;",
                loginPage.getFirstInvalidField()
        );

        // Validation message must exist
        assertTrue("Expected browser validation message, but got none!",
                actualMessage != null && !actualMessage.isEmpty());
    }
}
