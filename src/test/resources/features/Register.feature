@smoke @register
Feature: Register to hapifyMe

  Background:
    Given the user opens the login page "https://test.hapifyme.com/login_register.php"
    And the user clicks on the register link

  @valid
  Scenario: Register successfully using valid credentials
    When the user enters first name
    And the user enters last name
    And the user enters email
    And the user enters password
    And the user presses the register button
    Then the user should see an success message "You're all set! Go ahead and login! Please check your email to activate your account."