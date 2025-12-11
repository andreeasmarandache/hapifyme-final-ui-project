package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

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

    public void updateProfileDetails(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String field = row.get("field");
            String value = row.get("value");

            if (field.equals("FirstName")) {
                updateFirstName(value);
            } else if (field.equals("LastName")) {
                updateLastName(value);
            }
        }
    }

    public void clickUpdateDetailsButton() {
        $(updateDetailsButton).click();
    }
}
