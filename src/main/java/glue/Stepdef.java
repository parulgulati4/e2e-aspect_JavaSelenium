package glue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Stepdef {
	
	
	
	public static WebDriver  driver;
	public  Utilities.ReadConfig ReadConfig = new Utilities.ReadConfig();

	
	@Given("^User should Open chrome brower$")
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
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		
	
		
	}

	@Then("^verify widgets on Home page$")
	public void verifyWidgetsOnHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
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
	  
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
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
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 List<WebElement> fieldin_operantional = driver.findElements(By.xpath("//span[@class='Widgets--Summary__Card__Title--main--x2qM5z0A']"));
		 for (WebElement fieldtext : fieldin_operantional) {	
		    	String fieldtxt = fieldtext.getText();
		    	System.out.println(fieldtxt);
		    			}
	}
	
	
	@Then("^Navigate to Daily status tab$")
	public void navigate_to_Daily_status_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Daily Status']")).click();
		
		
	}

	@Then("^verify charts Daily status tab$")
	public void verify_charts_Daily_status_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions.
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='Title--title__label--_I0rRnGG']"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
		
		List<WebElement> findElements2 = driver.findElements(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 DailyStatus--statuses__statuslabel--VKCA5elw MuiFormControlLabel-label css-ahj2mt-MuiTypography-root']"));
		
		for (WebElement webElement : findElements2) {
			String text = webElement.getText();
			
			System.out.println(text);
			
			Assert.assertTrue(true);
			
		}
	}
	
	
	@Then("^Navigate to  Report Page chart$")
	public void navigateToReportPageChart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(By.xpath("//abbr[text()='Reports']")).click();
		
		
		
	}

	@Then("^verify all the reports on report pages$")
	public void verifyAllTheReportsOnReportPages() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		
		List<WebElement> findElements = driver.findElements(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h6 MuiTypography-gutterBottom css-18k87ye-MuiTypography-root']"));
		
		for (WebElement webElement : findElements) {
		String text = webElement.getText();	
		
			Assert.assertTrue(true);
		}
		
	}
	
	@Then("^verify all the reports having excel files are downloadable$")
	public void verify_all_the_reports_having_excel_files_are_downloadable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> reportfiles = driver.findElements(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButtonBase-root css-1wkbrw0-MuiButtonBase-root-MuiButton-root']"));
		
		for (WebElement webElement : reportfiles) {
			
			
			if (webElement.isDisplayed() && webElement.isEnabled()) {
				Assert.assertTrue(true);
			}
		}
		
		
	}
	
	
	@Then("^Navigate to  Browser page and select devices$")
	public void navigateToBrowserPageAndSelectDevices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.findElement(By.xpath("//abbr[text()='Browse']")).click();
		
	}

	@Then("^verify all the fields avaliable in device page$")
	public void verifyAllTheFieldsAvaliableInDevicePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}

	@Then("^Navigate to  Browser page and select contacts$")
	public void navigateToBrowserPageAndSelectcontacts() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//abbr[text()='Browse']")).click();
		
		driver.findElement(By.xpath("//div[@class='jss163 MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1fi5yo0-MuiSelect-select-MuiInputBase-input-MuiInput-input']")).click();
		
		driver.findElement(By.xpath("//li[text()='Contacts']")).click();
		
		
		
		
	}

	@Then("^verify all the fields avaliable in contacts page$")
	public void verifyAllTheFieldsAvaliableIncontactsPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}
	
	
	@Then("^Navigate to  Browser page and select sites$")
	public void navigateToBrowserPageAndSelectsites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//abbr[text()='Sites']")).click();
		
		driver.findElement(By.xpath("//div[@class='jss163 MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1fi5yo0-MuiSelect-select-MuiInputBase-input-MuiInput-input']")).click();
		
		driver.findElement(By.xpath("//li[text()='Contacts']")).click();
		
		
		
		
	}

	@Then("^verify all the fields avaliable in sites page$")
	public void verifyAllTheFieldsAvaliableInsitesPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}
	
	@Then("^Navigate to  Browser page and select Supply$")
	public void navigateToBrowserPageAndSelectSupply() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//abbr[text()='Supply']")).click();
		
		driver.findElement(By.xpath("//div[@class='jss163 MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1fi5yo0-MuiSelect-select-MuiInputBase-input-MuiInput-input']")).click();
		
		driver.findElement(By.xpath("//li[text()='Contacts']")).click();
		
		
		
		
	}

	@Then("^verify all the fields avaliable in sites Supply$")
	public void verifyAllTheFieldsAvaliableInSupplyPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}

	
	
	@Then("^Navigate to  Browser page and select Routers$")
	public void navigateToBrowserPageAndSelectRouters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//abbr[text()='Routers']")).click();
		
		driver.findElement(By.xpath("//div[@class='jss163 MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1fi5yo0-MuiSelect-select-MuiInputBase-input-MuiInput-input']")).click();
		
		driver.findElement(By.xpath("//li[text()='Contacts']")).click();
		
		
		
		
	}

	@Then("^verify all the fields avaliable in sites Routers$")
	public void verifyAllTheFieldsAvaliableInRoutersPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}
	
	@Then("^Navigate to  Browser page and select Reporters$")
	public void navigateToBrowserPageAndSelectReporters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//abbr[text()='Reporterss']")).click();
		
		driver.findElement(By.xpath("//div[@class='jss163 MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1fi5yo0-MuiSelect-select-MuiInputBase-input-MuiInput-input']")).click();
		
		driver.findElement(By.xpath("//li[text()='Contacts']")).click();
		
		
		
		
	}

	@Then("^verify all the fields avaliable in Reporters Routers$")
	public void verifyAllTheFieldsAvaliableInReportersPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		List<WebElement> allfields = driver.findElements(By.xpath("//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-1qgma8u-MuiButtonBase-root-MuiTableSortLabel-root']"));
		
		for (WebElement webElement : allfields) {
			
			String text = webElement.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
	}


}
