package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilities.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(
		 monochrome=true,
		features = "src\\main\\resources\\Features",
       
		glue ={"com.stepdefinitions"},
		
		snippets=SnippetType.CAMELCASE,
		strict=true,
		
    
				//format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
//				plugin = { "pretty",
//						
//		 "json:src\\test\\resources\\Reports\\cucumber.json"},
				
				
						plugin = {"pretty",
				                "html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
				                "json:src\\test\\resources\\Reports\\cucumber.json"		                
		 },
		
		
			

		  dryRun = false

)

public class Runner {
	
	
	
	@AfterClass
	public static void generateCucumberReport()
	{
		JVMReport.generateJVMreport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\cucumber.json");
	} 

}
