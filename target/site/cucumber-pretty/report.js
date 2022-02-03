$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Try to login with admin and lower level users checking the menu we receive.",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User should Open chrome brows",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User will Open Application URL",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User will Enter UserName and Password  and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate the DashBoard URL",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.userShouldOpenChromeBrows()"
});
formatter.result({
  "duration": 13969269600,
  "status": "passed"
});
formatter.match({
  "location": "glue.user_will_open_the_page()"
});
