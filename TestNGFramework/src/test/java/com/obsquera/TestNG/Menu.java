package com.obsquera.TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Menu extends Base{
	
	@Test
	public void menuSelection()
	{   
		String inputOption= "Radio Buttons Demo";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		//WebElement  menu=driver.findElement(By.xpath("//ul[contains(@class,'list-group list-group-flush')]//child::li"));
		List<WebElement> list1=driver.findElements(By.xpath("//ul[contains(@class,'list-group list-group-flush')]//child::li//a"));
			
		for (WebElement option:list1)
		{
			String menuOption=option.getText();
			
			if(menuOption.equals(inputOption))
			{   
				System.out.println(menuOption);
				option.click();
				break;
			}
		}
		
	}
	
	

}
