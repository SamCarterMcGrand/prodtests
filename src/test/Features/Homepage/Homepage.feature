Feature: Test login functionality
    Scenario: user should be able to view homepage elements
    Given the user is on the homepage
    Then the correct homepage elements should be displayed
    And the user will be able to click login

    Scenario: user should be able to login and view correct elements
    Given the user is on the login page
    When logs in with user name "cs-everything@clrscr.uk" and password "Pa55word"
    Then the user should be on the main page
    And the correct main page elements should be displayed