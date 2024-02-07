Feature: Navigation Bar
  To see the subpages
  Without logging in
  I can click the navigation bar links

  Scenario: I can access to the subpages through the navigation bar
    Given I navigate to Free Range Testers web page
    When I try to access the free sections through the navigation bar
    Then I am redirected to the right page