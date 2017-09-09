package com.step.page.object;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Asset;
import pages.log;
import pages.logout;

public class steppageobject {
	WebDriver driver;
	log login;
	logout out; 
	Asset assets;
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		login  = new log(driver);
		login.navigateTo();
	}

	@When("^Give the username and Password$")
	public void give_the_username_and_Password() throws Throwable {
		login.logasadmin();
		
	}

	@When("^Click login$")
	public void click_login() throws Throwable {
		
	}

	@Then("^logout of salesforce$")
	public void logout_of_salesforce() throws Throwable {
		out = new logout(driver);
		out.signout();
	}
	@When("^Create an asset$")
	public void create_an_asset() throws Throwable {
		   assets = new Asset(driver);
		   assets.createanAsset();
		}
	
@Before 
public void start(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
@After
public void off()
{
	driver.quit();
}

}
