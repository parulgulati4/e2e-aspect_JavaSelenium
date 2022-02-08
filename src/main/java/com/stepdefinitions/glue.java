package com.stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Base.BaseClass;
import Utilities.ReadConfig;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class glue  {

	public static WebDriver  driver;
	public  ReadConfig ReadConfig = new ReadConfig();

	
	@Given("^User should Open chrome brows$")
	public void userShouldOpenChromeBrows() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);	
		 driver = new ChromeDriver(options);
	    
	}
		
	@When("^User will Open Application URL$")
		public void user_will_open_the_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.get(ReadConfig.ApplicationURL());
		}

	@Then("^User will Enter UserName and Password  and click on login button$")
	public void userWillEnterUserNameAndPasswordAndClickOnLoginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 Thread.sleep(4000);
		 
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(ReadConfig.UserName());
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadConfig.Password());
	    driver.findElement(By.xpath("//button[@data-test='loginSubmit']")).click();
	    Thread.sleep(4000);
	   
	}
	
	
	@Then("^Validate the DashBoard URL$")
	public void validateTheDashBoardURL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)

		 Thread.sleep(4000);
		    String dashUrl = driver.getCurrentUrl();    
		    System.out.println(dashUrl);
		    
		    Assert.assertEquals(dashUrl, "https://demo.aspect.id/dashboard");
	}

	
	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   driver.quit();
	    
	}


	@Then("^User should be in home page$")
	public void userShouldBeInHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
	    throw new PendingException();
	}

	@Then("^verify widgets on Home page$")
	public void verifyWidgetsOnHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    
	    String site = driver.findElement(By.xpath("//span[text()='Sites']")).getText();
		 Assert.assertEquals(site, "Sites");
		
		 String devices = driver.findElement(By.xpath("//span[text()='Devices']")).getText();
		 Assert.assertEquals(devices, "Devices");
		 
		 String Results = driver.findElement(By.xpath("//span[text()='Results']")).getText();
		 Assert.assertEquals(Results, "Results");
		 
		 String Contacts = driver.findElement(By.xpath("//span[text()='Contacts']")).getText();
		 Assert.assertEquals(Contacts, "Contacts");
	    
	}

	
	
	@Then("^verify graphs on home page$")
	public void verifyGraphsOnHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	    
	}

	@Then("^Navigate to Operantional data page$")
	public void navigateToOperantionalDataPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    
	   
	    driver.findElement(By.xpath("//abbr[text()='Operational Data']")).click();
	    
	    List<WebElement> fieldin_operantional = driver.findElements(By.xpath("(//div[@class='Widgets--summary__groupTitle--Dv0u669K'])"));
	    int size = fieldin_operantional.size();
	    
	    Assert.assertEquals(size, 4);
	    
	    
	    for (WebElement fieldtext : fieldin_operantional) {
			
	    	String fieldtxt = fieldtext.getText();
	    	System.out.println(fieldtxt);
	    	
	    	
	    	
		}
	    Thread.sleep(4000);	
	}

	@Then("^verify charts on operational data page$")
	public void verifyChartsOnOperationalDataPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 List<WebElement> fieldin_operantional = driver.findElements(By.xpath("//span[@class='Widgets--Summary__Card__Title--main--x2qM5z0A']"));
	 
		 for (WebElement fieldtext : fieldin_operantional) {
				
		    	String fieldtxt = fieldtext.getText();
		    	System.out.println(fieldtxt);
		    
			}
	}

	
	
		
	

		


	
}
