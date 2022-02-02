


Feature: Login Page

  Scenario Outline: Try to login with admin and lower level users checking the menu we receive.
    Given User Lunch Chrome Brows
    When User will open the page "http://next-release.aspect.id/login"
    Then User will Enter UserName and Password "<username>" "<password>"
    Then User will Click on Login button
    
   Examples: 
      | username  | password      | 
      | admin     | test07        |      