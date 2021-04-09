package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="E:/Selenium/cumcumbe/src/main/java/Featruepackage/accountcreation.feature",
                 glue={"stepdefinitions"},
		         plugin = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		         monochrome = true,
		         dryRun = false)
public class lmensaccountcreation {
	

}
