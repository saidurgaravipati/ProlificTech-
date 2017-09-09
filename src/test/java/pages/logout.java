package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logout extends base{

	public logout(WebDriver driver) {
		super(driver);
		
	}
	public logout signout() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	 	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='userNavLabel']")));
		element.click();
		driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]")).click();
		  Thread.sleep(3000);
		  		   
		   return new logout(driver);
	}
	
}
