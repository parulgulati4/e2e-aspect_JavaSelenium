package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass {


    public void  LoginApp(String username,String Password){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        
        driver.findElement(By.xpath("//label[text()='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//label[text()='Password']")).sendKeys(Password);

    }

}
