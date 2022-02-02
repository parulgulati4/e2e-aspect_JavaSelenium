package Utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	
	public static void generateJVMreport(String json){
		
		
		File  repodic =  new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
			
		Configuration configuration = new Configuration(repodic, "Aspect Test Automation");
		
		configuration.addClassifications("OS","WINDOWS 10");
		configuration.addClassifications("Browser","Chromes");
		configuration.addClassifications("Browser Version","9.9");
		configuration.addClassifications("BuildDate ","22-2-2020");
		configuration.addClassifications("Sprint_cycle","36");
		
		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(json);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
	}
	
	
	
}
