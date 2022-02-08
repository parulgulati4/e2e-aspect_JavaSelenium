package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilities.CucumberReport;
import Utilities.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(
		 monochrome=true,
				
		features = "src\\main\\resources\\Features",
				//plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
				//plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
			
		
		glue ={"com.stepdefinitions"},
				
		snippets=SnippetType.CAMELCASE,
		strict=true,
		
				
				
		  dryRun = false

)

public class Runner {
	
	
	
	@AfterClass
	public static void generateCucumberReport()
	{
		
	} 

}
