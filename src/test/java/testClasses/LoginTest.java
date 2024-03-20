package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.AddAccountPage;
import objectRepository.LoginPage;

public class LoginTest {
	 WebDriver driver;
@Test	
public void login() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    
   LoginPage loginpage=new LoginPage(driver);
   loginpage.emailfield().sendKeys("mahimayadowansi@gmail.com");
   loginpage.passwordfield().sendKeys("Mahima123");
   loginpage.loginBtn().click();
   
   AddAccountPage addaccountpage=new AddAccountPage(driver);
   Assert.assertTrue(addaccountpage.account().isDisplayed());
   Thread.sleep(3000);
}
@AfterMethod
public void close()
{
	driver.close();
}

}
