


Feature: Login Page

  Scenario: Try to login with admin and lower level users checking the menu we receive.
    Given User should Open chrome browser
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Validate the DashBoard URL
   
  
    
       