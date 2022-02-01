package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		 monochrome=true,
		features = "src\\main\\resources\\Features",
       
		glue ={"com.stepdefinitions"},
      
				format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		
		  dryRun = false

)

public class Runner {
}
