$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("object.feature");
formatter.feature({
  "line": 1,
  "name": "Perform Page object model",
  "description": "",
  "id": "perform-page-object-model",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2849971882,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Salesforce",
  "description": "",
  "id": "perform-page-object-model;login-to-salesforce",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Give the username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "logout of salesforce",
  "keyword": "Then "
});
formatter.match({
  "location": "steppageobject.open_the_browser()"
});
formatter.result({
  "duration": 5774638464,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.give_the_username_and_Password()"
});
formatter.result({
  "duration": 6391404986,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.click_login()"
});
formatter.result({
  "duration": 20907,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.logout_of_salesforce()"
});
formatter.result({
  "duration": 16019349727,
  "status": "passed"
});
formatter.after({
  "duration": 1170875868,
  "status": "passed"
});
formatter.before({
  "duration": 1925424340,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create an Asset",
  "description": "",
  "id": "perform-page-object-model;create-an-asset",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Give the username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click login",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Create an asset",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "logout of salesforce",
  "keyword": "Then "
});
formatter.match({
  "location": "steppageobject.open_the_browser()"
});
formatter.result({
  "duration": 5304064761,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.give_the_username_and_Password()"
});
formatter.result({
  "duration": 5147221082,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.click_login()"
});
formatter.result({
  "duration": 14080,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.create_an_asset()"
});
formatter.result({
  "duration": 16767704716,
  "status": "passed"
});
formatter.match({
  "location": "steppageobject.logout_of_salesforce()"
});
formatter.result({
  "duration": 3515997413,
  "status": "passed"
});
formatter.after({
  "duration": 1021652443,
  "status": "passed"
});
});