package com.obsquera.TestNG;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Base {
public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser()
	{
		//To invoke Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Seleniumtestingtutorial\\TestNGFramework\\src\\test\\java\\Resources\\chromedriver.exe" );
	   driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	
	
	
	public void driverClose()
	{
		driver.close();
	}
	
	@AfterMethod
	public void driverQuit()
	{
		driver.quit();
	}
	


}

