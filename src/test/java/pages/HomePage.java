package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private By postArea = By.cssSelector(".posts_area");
    private By postInput = By.name("post_text");
    private By postButton = By.id("post_button");
    private By posts = By.cssSelector(".status_post");
    private By postBodyContent = By.cssSelector(".post_body_content");
    private By timestamp = By.cssSelector(".posted_by");
    private By settingsButton = By.xpath("//a[@href='settings.php']");

    public void verifyHomepage() {
        $(postArea).shouldBe(visible);
    }

    public void enterPost(String postBody) {
        $(postInput).setValue(postBody);
    }

    public void clickPostButton() {
        $(postButton).click();
    }

    public void verifyFirstPostJustNow() {
        $$(posts).first().$(timestamp).shouldHave(text("Just now"));
    }

    public void verifyFirstPostBody(String expectedBody) {
        $$(posts).first().$(postBodyContent).shouldHave(text(expectedBody));
    }

    public void clickSettingsButton() {
        $(settingsButton).click();
    }



}
