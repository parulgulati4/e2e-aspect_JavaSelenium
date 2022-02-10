package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import java.io.FileOutputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilities.AllureReport;
import Utilities.CucumberReport;
import Utilities.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(
		 monochrome=true,
				
		features = "src\\main\\resources\\Features",
		

//		
		//	plugin={"pretty","json:src\\test\\resources\\Reports\\cucumber.json"},
		
				plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		snippets=SnippetType.CAMELCASE,
		strict=true,
						
		
		  dryRun = false
		 
)

public class Runner {
	
	
	
	@BeforeClass
	public static void createTestDataForSmoke() {
	}

	@AfterClass
	public static void generateCucumberReport()
	{
		CucumberReport cucumberReport = new CucumberReport();
		cucumberReport.generateReport();
	} 
	
	
	
}
