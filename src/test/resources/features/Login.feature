@Login
Feature: Login form of the application

  @Test1
  Scenario Outline: 1. When user and password are send with valid values then user is logged successfully
  Positive test
    Given The URL application is accessed with success
    When User is send the valid "Username" and "Password"
    And  User is send one "<location>"
    Then "Login" button is pressed
    And "LoggedInMessage" with logged In appears having "<location>"
    And Logout button will be clicked
    Examples:
      | location          |
      | Isolation Ward    |
      | Laboratory        |
      | Outpatient Clinic |
      | Pharmacy          |
      | Registration Desk |

  @Test2
  Scenario: 2. When user press Logout then the page will return to login
  Positive test
    Given The URL application is accessed with success
    When User is send the valid "Username" and "Password"
    And  User is send one "Inpatient Ward"
    Then "Login" button is pressed
    And Logout button will be clicked

  @Test3
  Scenario Outline: 3. When user is login with invalid credentials then invalid message is returned
  Negative test
    Given The URL application is accessed with success
    When User is send the "Username" invalid value "<username>" and "Password" with invalid "<password>" credentials
    And  User is send one "Inpatient Ward"
    And "Login" button is pressed without verifying home page
    Then "LoginInvalidMessage" with invalid user/pass is returned
    Examples:
      | username | password |
      | test     | test     |
      | Admin    | test     |
      | test     | Admin123 |
      | @#$#     | Admin123 |
      | Admin    | @#$#     |









