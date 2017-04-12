$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "This feature deals with Login",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1439199967,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Click on Login button",
  "description": "",
  "id": "login-feature;click-on-login-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#And I enter following for login"
    }
  ],
  "line": 7,
  "name": "I get the list of all assets",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 4623927311,
  "status": "passed"
});
formatter.match({
  "location": "Login.iGetTheListOfAllImages()"
});
formatter.result({
  "duration": 4087282070,
  "status": "passed"
});
formatter.after({
  "duration": 81803839,
  "status": "passed"
});
formatter.before({
  "duration": 1121383174,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Click on Login button",
  "description": "",
  "id": "login-feature;click-on-login-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#And I enter following for login"
    }
  ],
  "line": 12,
  "name": "I check the status of the links",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 4572308072,
  "status": "passed"
});
formatter.match({
  "location": "Login.iCheckTheStatusOfTheLinks()"
});
