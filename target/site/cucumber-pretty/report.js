$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/E2E_Aspect.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Try to login with admin and lower level users checking the menu we receive.",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should Open chrome brower",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User will Open Application URL",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User will Enter UserName and Password  and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the DashBoard URL",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});