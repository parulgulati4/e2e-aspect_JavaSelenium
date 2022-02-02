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
  "name": "User will Enter UserName and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User will Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate Login test",
  "rows": [
    {
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_Lunch_Chrome_Brows()"
});
formatter.result({
  "duration": 20705174500,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_open_the_page()"
});
formatter.result({
  "duration": 10640684700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_Enter_UserName_and_Password()"
});
formatter.result({
  "duration": 5393466900,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_Click_on_Login_button()"
});
formatter.result({
  "duration": 385330900,
  "status": "passed"
});
formatter.match({
  "location": "Login.validate_Login_test()"
});
formatter.result({
  "duration": 769800,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.stepdefinitions.Login.validate_Login_test() in file:/C:/Users/dorab/AppCRM/E2e-aspect/target/classes/\u0027 with pattern [^Validate Login test$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Table:[[]]]. \nStep: Then Validate Login test\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
});