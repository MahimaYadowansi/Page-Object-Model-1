package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAccountPage {
WebDriver driver;

public AddAccountPage(WebDriver driver)
{
	this.driver=driver;
}
private By account=By.xpath("//*[@id=\"account-account\"]/ul/li[2]/a");

public WebElement account()
{
	return driver.findElement(account);
}
}
