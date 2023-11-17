Feature: Validating that user is able to access all the screen.

  Background:
    Given User has logged in.
    And User has been authenticated
    When User clicks on Sunglasses tab

  Scenario: Validating that user is able to access sunglasses section and see the list.
    Then Validate that sunglasses list shows up

  Scenario: Validating that user is able to access sunglasses section and click on a specific one.
    Then Validate that Books list shows up
    When user clicks on a specific one.
    Then make sure api response is 200 OK.

@smoke
  Scenario: Validating that user is able to access sunglasses section and click on a specific one, and user is routed to the description page.
    Then Validate that Books list shows up
    When user clicks on a specific one.
    Then Make sure user is routed to details page.