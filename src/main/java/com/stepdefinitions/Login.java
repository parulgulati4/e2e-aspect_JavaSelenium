package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static WebDriver  driver;

		@Given("^User Lunch Chrome Brows$")
		public void user_Lunch_Chrome_Brows() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		
		    driver.manage().deleteAllCookies();
		
			
		    
		}
		
		@When("^User will open the page \"([^\"]*)\"$")
		public void user_will_open_the_page(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.get(arg1);
		}

		@Then("^User will Enter UserName and Password \"([^\"]*)\" \"([^\"]*)\"$")
		public void user_will_Enter_UserName_and_Password(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			driver.findElement(By.xpath("//label[text()='Username']")).sendKeys(arg1);
		    driver.findElement(By.xpath("//label[text()='Password']")).sendKeys(arg2);
			
		}

		@Then("^User will Click on Login button$")
		public void user_will_Click_on_Login_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}


	
}
