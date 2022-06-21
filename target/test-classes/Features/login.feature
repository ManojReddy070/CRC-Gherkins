Feature: Feature to test login functionality

  Scenario Outline: Check crc website is entered in search field
    Given Enter the <url>
    And I am on the login page
    When I enter <email> and enter <password>
    And I click on the login button
    Then I should login successfull and should land on the home screen

    Examples: 
      | url                                    | email                          | password  |
      | https://qa.creditrepaircloud.com/login | debuglog@creditrepaircloud.com | Test@1234 |
