Feature: Validating the user's login flow

@smoke
  Scenario: Validating that user is able to login successfully.
    Given Constructing the login api with user's "test@gmail.com" and "Password@123".
    And we have the header also.
    When firing the login api.
    Then Validate that response has a response code as 200.
    And Validate that response has an api_key.

  @login
  Scenario Outline: Validating that user is able to login with different data.
    Given Constructing the login api with user's "<username>" and "<password>".
    When firing the login api.
    Then Validate that response has a response code as 200.
    And Validate that response has an api_key.

    Examples:
      | username          | password     |
      | test@gmail.com    | Password@123 |
      | test123@gmail.com | Password123# |