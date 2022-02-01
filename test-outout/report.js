$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Try to login with admin and lower level users checking the menu we receive.",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User Lunch Chrome Brows",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User will open the page \"http://next-release.aspect.id/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User will Enter UserName and Password \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User will Click on Login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.;;1"
    },
    {
      "cells": [
        "name1",
        "5"
      ],
      "line": 14,
      "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Try to login with admin and lower level users checking the menu we receive.",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User Lunch Chrome Brows",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User will open the page \"http://next-release.aspect.id/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User will Enter UserName and Password \"name1\" \"5\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User will Click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_Lunch_Chrome_Brows()"
});
formatter.result({
  "duration": 32800820000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://next-release.aspect.id/login",
      "offset": 25
    }
  ],
  "location": "Login.user_will_open_the_page(String)"
});
