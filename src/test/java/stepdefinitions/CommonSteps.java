package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CommonSteps {

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged into the application")
    public void performBackgroundLogin() {
        System.out.println("--- Background: Automatic Login is running ---");

        loginPage.openPage();

        loginPage.login("andreea.cristina86@yahoo.com", "QAtest4#");

        System.out.println("--- Background: Login complete. Post test begins. ---");
    }
}
