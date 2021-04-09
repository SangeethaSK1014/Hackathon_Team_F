$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Lumens.feature");
formatter.feature({
  "line": 1,
  "name": "Lumens login applicati",
  "description": "",
  "id": "lumens-login-applicati",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login to application using excel sheet",
  "description": "",
  "id": "lumens-login-applicati;login-to-application-using-excel-sheet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user should create an account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter login credentials from sheet \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on ligthing tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select on Chandeliers",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects on LargeChandeliers",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user add filters and check filters",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "lumens-login-applicati;login-to-application-using-excel-sheet;",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ],
      "line": 14,
      "id": "lumens-login-applicati;login-to-application-using-excel-sheet;;1"
    },
    {
      "cells": [
        "signin",
        "0"
      ],
      "line": 15,
      "id": "lumens-login-applicati;login-to-application-using-excel-sheet;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4385000,
  "status": "passed"
});
formatter.before({
  "duration": 11815654300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "login to application using excel sheet",
  "description": "",
  "id": "lumens-login-applicati;login-to-application-using-excel-sheet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user should create an account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter login credentials from sheet \"signin\" and 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on ligthing tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select on Chandeliers",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects on LargeChandeliers",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user add filters and check filters",
  "keyword": "Then "
});
formatter.match({
  "location": "lumenstestcase.user_should_create_an_account()"
});
formatter.result({
  "duration": 14772909500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signin",
      "offset": 36
    },
    {
      "val": "0",
      "offset": 48
    }
  ],
  "location": "lumenstestcase.enter_login_credentials_from_sheet_and(String,int)"
});
formatter.result({
  "duration": 36989886600,
  "status": "passed"
});
formatter.match({
  "location": "lumenstestcase.click_on_submit_button()"
});
formatter.result({
  "duration": 48683410500,
  "status": "passed"
});
formatter.match({
  "location": "lumenstestcase.user_clicks_on_ligthing_tab()"
});
formatter.result({
  "duration": 31845393500,
  "status": "passed"
});
formatter.match({
  "location": "lumenstestcase.user_select_on_Chandeliers()"
});
formatter.result({
  "duration": 18874442700,
  "status": "passed"
});
formatter.match({
  "location": "lumenstestcase.user_selects_on_LargeChandeliers()"
});
formatter.result({
  "duration": 17496479300,
  "status": "passed"
});
formatter.match({
  "location": "lumenstestcase.user_add_filters_and_check_filters()"
});
formatter.result({
  "duration": 84171913300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/tbody/tr[1]/td[3]/div[1]/button[2]\"}\n  (Session info: chrome\u003d89.0.4389.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027LAPTOP-T4TBH22P\u0027, ip: \u0027192.168.0.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\SANGEE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56986}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4a0167a6ac1dc90b85f09ea8fc94aa54\n*** Element info: {Using\u003dxpath, value\u003d/tbody/tr[1]/td[3]/div[1]/button[2]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitions.lumenstestcase.user_add_filters_and_check_filters(lumenstestcase.java:144)\r\n\tat ✽.Then user add filters and check filters(Lumens.feature:11)\r\n",
  "status": "failed"
});
});