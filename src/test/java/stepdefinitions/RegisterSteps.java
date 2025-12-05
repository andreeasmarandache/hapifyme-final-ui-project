package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.TestData;

public class RegisterSteps {

    LoginPage loginPage = new LoginPage();


    @And("the user clicks on the register link")
    public void userClicksOnRegisterLink(){
        loginPage.navigateToRegister();
    }

    @When("the user enters first name")
    public void userEntersFirstName(){
        String fName = TestData.randomNames();
        loginPage.enterFirstName(fName);
    }

    @And("the user enters last name")
    public void userEntersLastName(){
        String lName = TestData.randomNames();
        loginPage.enterLastName(lName);
    }

    @And("the user enters email")
    public void userEntersEmail() {
        String email = TestData.randomEmail();
        loginPage.enterEmailForReg(email);
    }

    @And("the user enters password")
    public void userEntersPassword() {
        String password = TestData.randomPassword();
        loginPage.enterPasswordForReg(password);
    }

    @And("the user presses the register button")
    public void userClicksRegister() {
        loginPage.clickRegisterButton();
    }

    @Then("the user should see an success message {string}")
    public void userShouldSeeAnSuccessMessage(String expectedMessage) {
        loginPage.verifySuccessMessage(expectedMessage);
    }
}
