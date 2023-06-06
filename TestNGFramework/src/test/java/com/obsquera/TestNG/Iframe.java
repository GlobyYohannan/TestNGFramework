package com.obsquera.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends Base{

	@Test
	public void iFrameSample()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement iFrameJmeterLink=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		
		iFrameJmeterLink.click();
		driver.switchTo().defaultContent();
	}
}
