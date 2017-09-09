package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class log extends base{

	public log(WebDriver driver) {
		super(driver);
	}

	public log logasadmin() throws InterruptedException{
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("sai@prolifictech.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Durga@18.");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(3000);
		return new log(driver);
	}
}
