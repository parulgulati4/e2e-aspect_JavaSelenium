package TestRunner;




import java.io.FileOutputStream;
import java.util.Properties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilities.AllureReport;
import Utilities.CucumberReport;
import Utilities.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(
		 monochrome=true,
				
		//features ={ "src\\test\\resources\\Features"},
		features = { "classpath:Features" },

//	plugin={"pretty","json:src\\test\\resources\\Reports\\cucumber.json"},
		
				//plugin = { "pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json", "rerun:target/rerun.txt" },
			//	plugin = { "pretty, html:target/site/cucumber-pretty, json:target/cucumber.json, rerun:target/rerun.txt" },

		plugin = {"pretty", "html:target/cucumber-pretty", "json:target/report/cucumber.json","rerun:target/rerun.txt", "junit:target/report/cucumber.xml"},

					//	glue = {"src\\main\\java\\glue"},

		glue = { "classpath:glue"},

		snippets= CucumberOptions.SnippetType.CAMELCASE,
		strict=true,

		tags = "@AspectFunctionality",
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
