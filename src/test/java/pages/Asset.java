package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Asset extends base{
	public Asset(WebDriver driver) {
		super(driver);
		
	}
	public Asset createanAsset() throws InterruptedException{
	driver.findElement(By.xpath(".//*[@id='Asset_Tab']/a")).click(); 
	System.out.println("opened the asset tab");
	driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click(); 
	System.out.println("opend the new tab"); 
	
	WebElement assetName = driver.findElement(By.id("Name"));
	assetName.sendKeys("Amazon account ");
	System.out.println("asset name entered");
	WebElement accName = driver.findElement(By.id("Account")); 
			accName.sendKeys("Atlanta");
			System.out.println("account name entered ");
		//select the status
		Select dropdown = new Select(driver.findElement(By.id("Status")));
			dropdown.selectByIndex(2);
			System.out.println("status entered ");
			driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]")).click();
			Thread.sleep(3000);
			return new Asset(driver);
}
}
