package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static com.codeborne.selenide.Selenide.open;
import pages.HomePage;
import pages.LoginPage;


public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("the user opens the login page {string}")
    public void userOpensLoginPage(String url) {
        open(url);
    }

    @When("the user enters email {string} to login")
    public void userEntersEmailToLogin(String email) {
        loginPage.enterEmailForLogin(email);
    }

    @And("the user enters password {string} to login")
    public void userEntersPasswordToLogin(String password) {
        loginPage.enterPasswordForLogin(password);
    }

    @And("the user presses the login button")
    public void userClicksLogin() {
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the homepage")
    public void userShouldBeRedirectedToHomepage() {
        homePage.verifyHomepage();
    }

    @Then("the user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedError) {
        loginPage.verifyErrorMessage(expectedError);
    }

}
