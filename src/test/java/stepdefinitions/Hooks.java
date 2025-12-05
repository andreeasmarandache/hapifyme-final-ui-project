package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.screenshot;

public class Hooks {

    @Before
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://test.hapifyme.com";
        Configuration.browserSize = "1920x1080";

        System.out.println("--- Start Scenario ---");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            screenshot(screenshotName);
            System.out.println("!!! Scenario Failed. Screenshot saved.");
        }
        closeWebDriver();
        System.out.println("--- Stop Scenario ---");
    }
}
