$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('IBMTraining_2\TestCaseProject\TestCases\LoginFunctionality.feature');
formatter.feature({
  "line": 1,
  "name": "Login functionality testing",
  "description": "",
  "id": "login-functionality-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Testing login functionality with valid credentials",
  "description": "",
  "id": "login-functionality-testing;testing-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"Admin\" in UserName field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters \"admin123\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Dashboard page should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.OpenApplication()"
});
formatter.result({
  "duration": 11764464100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.EnterUserName()"
});
formatter.result({
  "duration": 149952300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.EnterPassword()"
});
formatter.result({
  "duration": 131387799,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.ClickOnLogin()"
});
formatter.result({
  "duration": 1700320500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});