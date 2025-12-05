@smoke @profile
Feature: Edit user profile

  Background:
    Given the user is logged into the application

  @valid
  Scenario Outline: Edit user profile
    When the user clicks on the settings button
    And the user updates first name "<FirstName>"
    And the user updates last name "<LastName>"
    And the user clicks on the update details button
    Then the user should see the message "Details updated!"

    Examples:
      | FirstName | LastName     |
      | Cristina  | Smarandache  |
      | Ana       |              |
      |           | Popescu      |