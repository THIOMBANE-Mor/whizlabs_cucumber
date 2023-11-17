@prod
Feature: Validating that existing user can change his/her personal details.

  @Regression @smoke
  Scenario: User shall be able to change his/her password
    Given User has logged in.
    When Fire the passwordUpdate Api
    Then Validate that response has a response code as 200.
    And Validate that new password is updated.

@Regression
  Scenario Outline: User shall be able to edit multiple details in his/her profile.
    Given User has logged in.
    When Fire the profileUpdate api with "<profile options>"
    Then Validate that new information is reflecting in the profile.

    Examples:
      | profile options |
      | Address         |
      | Name            |
      | Mobile number   |





