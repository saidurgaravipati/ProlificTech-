package pages;

import org.openqa.selenium.WebDriver;

public class base {
protected WebDriver driver;

public base(WebDriver driver)
{
	this.driver = driver;
}
	public log navigateTo()
	{
	driver.navigate().to("https://login.salesforce.com/");
	return new log(driver);
		
	}
}
