$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LandingPage_Menu_About.feature");
formatter.feature({
  "name": "Landing Page Menu About us",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifu Landing Page Menu about us is present",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Landing_Page_Logo.i_am_in_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Landing Page Menu about us is present",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LandingPage_Menu_About.verify_Landing_Page_Menu_about_us_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Landing_page_logo.feature");
formatter.feature({
  "name": "Landing page Logo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Landing page Logo is visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Landing_Page_Logo.i_am_in_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Landing Page Logo is visible",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Landing_Page_Logo.verify_Landing_Page_Logo_is_visible()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cMicroTech NA[.]\u003e but was:\u003cMicroTech NA[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat pages.Page_Landing.verify_landing_logo(Page_Landing.java:20)\r\n\tat stepDefinitions.Landing_Page_Logo.verify_Landing_Page_Logo_is_visible(Landing_Page_Logo.java:24)\r\n\tat ✽.Verify Landing Page Logo is visible(file:///C:/java/workspace_framWork/class28_pom_lab/src/test/resources/features/Landing_page_logo.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});