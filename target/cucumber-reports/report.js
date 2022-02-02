$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Try to login with admin and lower level users checking the menu we receive.",
  "description": "",
  "id": "login-page;try-to-login-with-admin-and-lower-level-users-checking-the-menu-we-receive.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User should Open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User will Open Application URL",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User will Enter UserName and Password  and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate the DashBoard URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_Lunch_Chrome_Brows()"
});
formatter.result({
  "duration": 15279353800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_open_the_page()"
});
formatter.result({
  "duration": 7440990600,
  "status": "passed"
});
formatter.match({
  "location": "Login.userWillEnterUserNameAndPasswordAndClickOnLoginButton()"
});
formatter.result({
  "duration": 4621029400,
  "status": "passed"
});
formatter.match({
  "location": "Login.validateTheDashBoardURL()"
});
formatter.result({
  "duration": 4139326800,
  "status": "passed"
});
});