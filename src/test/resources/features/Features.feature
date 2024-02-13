Feature: Navigation Bar
  To see the subpages
  Without logging in
  I can click the navigation bar links

  #Scenario Outline: I can access to the subpages through the navigation bar
  #  Given I navigate to Free Range Testers web page
  #  When I try to access the <sections> through the navigation bar
  #  Then I am redirected to the right page
  #  Examples:
  #  | sections |
  #  | Cursos   |
  #  | Recursos |

  #Scenario: Courses are presented correctly to potential customers
  #  Given I navigate to Free Range Testers web page
  #  When I go to Cursos using the navigation bar
  #  And select Introduccion al Testing

  Scenario: Users can select a plan when signing up
    Given I navigate to Free Range Testers web page
    When I select Elegir Plan
    Then I can validate the options in the checkout page