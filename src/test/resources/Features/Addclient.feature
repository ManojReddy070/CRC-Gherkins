Feature: I want to add new client

  Scenario: I want to add new client in the Client module
    Given Select client tab
    Then Click on Add new client button
    And Pass the client First name
    And Pass client Last name
    And Click on Email Checkbox
    And Click on Save button
    And Click on Ok button in the warining popup
    Then User should navigate to client dashboard

  