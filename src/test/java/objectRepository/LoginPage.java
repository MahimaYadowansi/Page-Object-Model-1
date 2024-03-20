package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	//create a constructor so that this class driver can be accessed by other class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By emailfield= By.id("input-email");
	private By passwordfield=By.id("input-password");
	private By loginBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	//creating public method to access private variable outside the class
	
	public WebElement emailfield()
	{
		return driver.findElement(emailfield);
	}
	
	public WebElement passwordfield()
	{
		return driver.findElement(passwordfield);
	}
	
	public WebElement loginBtn()
	{
		return driver.findElement(loginBtn);
	}
}
