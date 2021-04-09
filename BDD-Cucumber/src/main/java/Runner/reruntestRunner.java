package Runner;


	import org.junit.runner.RunWith;


	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	//import managers.fileReader;
	    @RunWith(Cucumber.class)
	    @CucumberOptions(
	            features="@target/failedrun.txt",
	                    glue={"StepDefinitions"},
	            		
	                    		// plugin = { "pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	                    		 
	                    
	                    plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","html:test-output",
	                    		"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml","rerun:target/failedrerun.txt"},
	                    		
	                    monochrome=true,
	                        dryRun=false
	                        )

public class reruntestRunner {
	    }
	    