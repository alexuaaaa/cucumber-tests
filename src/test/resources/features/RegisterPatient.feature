@RegisterPatient
Feature: Register a patient

  @Test1
  Scenario: Register a patient and after that set confirm
    Given The URL application is accessed with success
    When User is send the valid credentials
    And  User is send one "Inpatient Ward"
    Then Login button is pressed
    And Register a patient button is sent
    And The name of the patient is provided
      | given | middle | familyName |
      | Alex  | Andrei | Albu       |
      | Maria | Ana    | Popescu    |
    And The gender is provided
      | Gender |
      | Male   |
      | Female |
    And The birthday is set
      | Day | Year |
      | 10  | 1990 |
      | 20  | 1991 |
    And User will send the address
      | Address   |
      | Cluj      |
      | Bucuresti |
    And User will provide the telephone
      | Phone      |
      | 0734364811 |
      | 0745443533 |
    And User will send the patient related to
      | Relation Type | Person name |
      | Doctor        | Alex        |
      | Parent        | Maria       |
    And User will press confirm
    And Page With User Information will appear
