package com.obsquera.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base {
	
	@Test
	public void actionClassSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggableN1=driver.findElement(By.xpath("//span[contains(text(),'Draggable n°1')]"));
		WebElement targetLocation=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.moveToElement(draggableN1).build().perform();
		action.doubleClick(draggableN1).perform();
		action.contextClick(draggableN1).perform();
	}

}
