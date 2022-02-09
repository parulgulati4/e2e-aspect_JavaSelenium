Feature: Login Page

  Scenario: Try to login with admin and lower level users checking the menu we receive.
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Validate the DashBoard URL
    Then Close the browser

  Scenario: Verify Home page widgets and graphs
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then verify widgets on Home page
    Then verify graphs on home page
    Then Close the browser

  Scenario: Verify Operational Data Dashboard widgets and charts
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to Operantional data page
    Then verify charts on operational data page
    Then Close the browser

  Scenario: Verify Operational Daily status widgets and charts
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to Operantional data page
    Then Navigate to Daily status tab
    Then verify charts Daily status tab
    Then Close the browser

   
    Scenario: Verify Report Page chart
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to  Report Page chart
    Then verify all the reports on report pages  
    Then Close the browser 