@Login
Feature: OrangeHRM Login Functionality
  I want to login to the orangehrm website
  
  Scenario Outline: Login
    When I enter "<username>" as username
    And I enter "<password>" as password
    And I click on the login button
    Then I should "<outcome>"
    And check the "<option>"

    Examples:
      | username        | password       | outcome           |option      |
      | Admin           | admin123       | Dashboard         |Assign Leave|
      | Admin           | admin123       | Dashboard         |Leave List  |
      | Admin           | admin123       | Dashboard         |Timesheets  |
      | Admin           | admin123       | Dashboard         |Apply Leave |
      | Admin           | admin123       | Dashboard         |My Leave    |
      | Admin           | admin123       | Dashboard         |My Timesheet|
      
      
      
