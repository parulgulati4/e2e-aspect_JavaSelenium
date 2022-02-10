Feature: Login Page

  @TC1
  Scenario: Try to login with admin and lower level users checking the menu we receive.
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Validate the DashBoard URL
    Then Close the browser

  @TC2
  Scenario: Verify Home page widgets and graphs
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then verify widgets on Home page
    Then verify graphs on home page
    Then Close the browser

  @TC3
  Scenario: Verify Operational Data Dashboard widgets and charts
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to Operantional data page
    Then verify charts on operational data page
    Then Close the browser

  @TC4
  Scenario: Verify Operational Daily status widgets and charts
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to Operantional data page
    Then Navigate to Daily status tab
    Then verify charts Daily status tab
    Then Close the browser

  @TC5
  Scenario: Verify Report Page chart
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to  Report Page chart
    Then verify all the reports on report pages
    Then Close the browser

  @TC6
  Scenario: Verify Report Page obtain 12reports & check if excel is downloaded
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to  Report Page chart
    Then verify all the reports on report pages
    Then verify all the reports having excel files are downloadable
    Then Close the browser

  @TC7
  Scenario: Verify Browser  Page and select devices check all the fields
    Given User should Open chrome brower
    When User will Open Application URL
    Then User will Enter UserName and Password  and click on login button
    Then Navigate to  Browser page and select devices
    Then verify all the fields avaliable in device page
    Then Close the browser
