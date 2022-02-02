package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;
import Utilities.ReadConfig;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login  {

	public static WebDriver  driver;
	public  ReadConfig ReadConfig = new ReadConfig();

	@Given("^User should Open chrome browser$")
		public void user_Lunch_Chrome_Brows() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();   
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

	
	
		
	

		


	
}
