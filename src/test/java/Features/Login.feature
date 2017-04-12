Feature: Login Feature
  This feature deals with Login

  Scenario: Click on Login button
    Given I navigate to the login page
    #And I enter following for login
    And I get the list of all assets

  Scenario: Click on Login button
    Given I navigate to the login page
    #And I enter following for login
    And I check the status of the links

  Scenario: Click on Login button failure
    Given I navigate to the login page
    #And I enter following for login
    Then I click on submit button