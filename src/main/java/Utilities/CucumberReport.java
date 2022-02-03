package Utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReport {

	 public void generateReport()
	  {
	    Runtime.getRuntime().addShutdownHook(new Thread() 
	    { 
	      public void run() 
	      {  




//Logger.logInfo(CucumberReport.class,"Shutdown Hook is running !"); 
		String projectFolder=System.getProperty("user.dir");
		String TargetFolder=projectFolder+"/target";
		File reportOutputDirectory = new File(TargetFolder);
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(TargetFolder+"/cucumber.json"); 
		String buildNumber = "1";
		String projectName = "ECD";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;
		Configuration configuration = new Configuration(reportOutputDirectory,projectName);
//		configuration.setParallelTestin(parallelTesting); 
//		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		//Logger.logInfo(CucumberReport.class,"Generating Reports");
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports(); 
	}
	    
	  }); 

} 

	/*
	public static void main(String[] args) {
		String projectFolder=System.getProperty("user.dir");
		String TargetFolder=projectFolder+"/target";
		File reportOutputDirectory = new File(TargetFolder);
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(TargetFolder+"/cucumber.json");

		String buildNumber = "1";
		String projectName = "BDM Application";
		String OSNAME =System.getProperty("os.name");
//		System.out.println(OSNAME);
		String UserName =System.getProperty("user.name");
		System.out.println(UserName);
		boolean runWithJenkins = false;
		boolean parallelTesting = false;

		Configuration configuration = new Configuration(reportOutputDirectory,projectName);
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		configuration.setOwnerExecution(UserName);
		configuration.setPlatform(OSNAME);
		//configuration.setSortingMethod(sortingMethod);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
*/
}
