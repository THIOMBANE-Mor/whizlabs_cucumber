Feature: Validate that user is able to SignUp.

  @smoke
  Scenario: Validating that user is able to SignUp after submitting the form.
    Given User is able to fill the form with following details
      | ABC | ABC_01 | password@123 | 22Jan1990 | 32 | Male   | India
      | XYZ | XYZ_01 | 123@password | 22Oct1992 | 30 | Female | Singapore
      When User is able to fire SignUp api
      Then User's data is created in database.