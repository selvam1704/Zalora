$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Zalora.feature");
formatter.feature({
  "name": "Validating Zalora Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating Booking Product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Entered into the zalora Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.entered_into_the_zalora_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering Valid Login Credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.entering_Valid_Login_Credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Searching For product product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.searching_For_product_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting and adding the product in the bag",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.selecting_and_adding_the_product_in_the_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering the delivery address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.entering_the_delivery_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering the Payment details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.entering_the_Payment_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "geting the Outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.geting_the_Outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating Entire HomePage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Entering into the Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.entering_into_the_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating images and links",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.validating_images_and_links()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.validating_the_outcome()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d81.0.4044.129)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-G14BGF38\u0027, ip: \u0027192.168.43.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.129, chrome: {chromedriverVersion: 81.0.4044.69 (6813546031a4b..., userDataDir: C:\\Users\\arumu\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52802}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: caadd3aa89ea4bedb037ea08a8630587\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat org.baseclass.UtilityClass.loadUrl(UtilityClass.java:51)\r\n\tat com.stepdefintion.StepDefintion.entering_into_the_Website(StepDefintion.java:102)\r\n\tat ✽.Entering into the Website(file:src/test/resources/Feature/Zalora.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "validating images and links",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.validating_images_and_links()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validating the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.validating_the_outcome()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});