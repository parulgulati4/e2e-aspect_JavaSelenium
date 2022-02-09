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
		
				plugin={"pretty","json:src\\test\\resources\\Reports\\cucumber.json"},
		
		glue ={"com.stepdefinitions"},
				
		snippets=SnippetType.CAMELCASE,
		strict=true,
		
				
				
		  dryRun = false

)

public class Runner {
	
	
	
	@AfterClass
	public static void generateCucumberReport()
	{
		JVMReport.generateJVMreport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\cucumber.json");
	} 

}
