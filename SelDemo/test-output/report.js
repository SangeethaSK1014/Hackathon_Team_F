$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LumenAppDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Lumens application",
  "description": "",
  "id": "validation-of-lumens-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Account creation and Sign in",
  "description": "",
  "id": "validation-of-lumens-application;account-creation-and-sign-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Lumen URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify the Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Sign in the application",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user fills the form from given sheetname \"\u003cSheetName\u003e\" and rownumber \u003cRowNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Search item in searchbar",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Navigate to the Cart and validate the item",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "validation-of-lumens-application;account-creation-and-sign-in;",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ],
      "line": 14,
      "id": "validation-of-lumens-application;account-creation-and-sign-in;;1"
    },
    {
      "cells": [
        "LoginDetails",
        "0"
      ],
      "line": 15,
      "id": "validation-of-lumens-application;account-creation-and-sign-in;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1062000,
  "status": "passed"
});
formatter.before({
  "duration": 4753585900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Account creation and Sign in",
  "description": "",
  "id": "validation-of-lumens-application;account-creation-and-sign-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Lumen URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify the Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Sign in the application",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user fills the form from given sheetname \"LoginDetails\" and rownumber 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Search item in searchbar",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Navigate to the Cart and validate the item",
  "keyword": "Then "
});
formatter.match({
  "location": "StepLumenDemo.navigate_to_Lumen_URL()"
});
formatter.result({
  "duration": 1160391200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Browsing context has been discarded\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-UI07VRIF\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 87.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210318103112, moz:geckodriverVersion: 0.29.1, moz:headless: false, moz:processID: 18548, moz:profile: C:\\Users\\sahua\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2b26a980-3b1c-4e88-b8b6-1821dc974067\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat com.stepstoTest.StepLumenDemo.navigate_to_Lumen_URL(StepLumenDemo.java:64)\r\n\tat ✽.Given Navigate to Lumen URL(LumenAppDemo.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepLumenDemo.verify_the_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepLumenDemo.user_Sign_in_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginDetails",
      "offset": 42
    },
    {
      "val": "0",
      "offset": 70
    }
  ],
  "location": "StepLumenDemo.user_fills_the_form_from_given_sheetname_and_rownumber(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepLumenDemo.user_Search_item_in_searchbar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepLumenDemo.user_Click_on_Add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepLumenDemo.user_Navigate_to_the_Cart_and_validate_the_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 560089400,
  "status": "passed"
});
formatter.after({
  "duration": 68341000,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-UI07VRIF\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 87.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210318103112, moz:geckodriverVersion: 0.29.1, moz:headless: false, moz:processID: 18548, moz:profile: C:\\Users\\sahua\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2b26a980-3b1c-4e88-b8b6-1821dc974067\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:452)\r\n\tat com.stepstoTest.StepLumenDemo.quitBrowser(StepLumenDemo.java:186)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:222)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:210)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:204)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:50)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});