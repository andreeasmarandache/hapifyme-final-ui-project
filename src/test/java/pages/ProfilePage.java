package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private By firstNameInput = By.name("first_name");
    private By lastNameInput = By.name("last_name");
    private By updateDetailsButton = By.name("update_details");

    public void updateFirstName(String firstName) {
        $(firstNameInput).setValue(firstName);
    }

    public void updateLastName(String lastName) {
        $(lastNameInput).setValue(lastName);
    }

    public void clickUpdateDetailsButton() {
        $(updateDetailsButton).click();
    }
}
