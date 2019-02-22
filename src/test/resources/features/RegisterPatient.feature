@RegisterPatient
Feature: Register a patient

  @Test1
  Scenario: Register a patient and after that set confirm
    Given The URL application is accessed with success
    When User is send the valid "Username" and "Password"
    And  User is send one "Inpatient Ward"
    Then "Login" button is pressed
    And "RegisterPatient" button is sent
    And The PatientDetails with "GivenName" and "MiddleName" and "FamilyName" are set
      | Given | Middle | FamilyName |
      | Alex  | Andrei | Albu       |
    And The gender is provided
      | Gender | Path                              |
      | Male   | //*[@id="gender-field"]/option[1] |
    And The birthday is set
      | Day | Year |
      | 10  | 1990 |
    And User will send the address "Bucuresti"
    And User will provide the telephone "0734364811"
    And User will send the patient related to
      | LastName | FirstName |
      | Albu     | Alexandru |
    And User will press confirm
    And Page With User Information will appear
#    And The page contains the following data
#    |||
