package sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class s11 {
	
	
	public static  ReadConfig ReadConfig = new ReadConfig();
	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver", "C:/Users/dorab/Desktop/Project2/e2e-aspect_JavaSelenium/drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.aspect.id");
		
		
		System.out.println("Title of the page:" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(ReadConfig.UserName());
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadConfig.Password());
	    driver.findElement(By.xpath("//button[@data-test='loginSubmit']")).click();
		
	    
	    System.out.println("Title of the page:" + driver.getTitle());
		
	}

}
