package com.obsquera.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base {
	
	@Test
	public void singleCheckBox()
	{
		String expectedSingleCheckBoxMessage="Success - Check box is checked";
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean singleCheckboxNotSelected=singleCheckbox.isSelected();
		assertFalse(singleCheckboxNotSelected,"single Checkbox is not Selected");
		singleCheckbox.click();
		boolean singleCheckboxSelected=singleCheckbox.isSelected();
		assertTrue(singleCheckboxSelected,"single Checkbox is not Selected");
		WebElement singleCheckBoxMessageField=driver.findElement(By.xpath("//div[@id='message-one']"));
		String singleCheckBoxMessage=singleCheckBoxMessageField.getText();
		assertEquals(expectedSingleCheckBoxMessage,singleCheckBoxMessage,"single Check Box Message is wrong");
	}
	
	@Test
	public void multipleCheckBoxDemo()
	{
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		checkBoxOne.click();
		checkBoxTwo.click();
		boolean checkBoxOneSelected=checkBoxOne.isSelected();
		assertTrue(checkBoxOneSelected,"check box one  is not Selected");
		boolean checkBoxTwoSelected=checkBoxTwo.isSelected();
		assertTrue(checkBoxTwoSelected,"check box Two  is not Selected");
		
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		boolean checkBoxOneSelectedAll=checkBoxOne.isSelected();
		assertTrue(checkBoxOneSelectedAll,"check box one  is not Selected");
		boolean checkBoxTwoSelectedAll=checkBoxTwo.isSelected();
		assertTrue(checkBoxTwoSelectedAll,"check box Two  is not Selected");
		boolean checkBoxThreeSelectedAll=checkBoxThree.isSelected();
		assertTrue(checkBoxThreeSelectedAll,"check box Three  is not Selected");
		boolean checkBoxFourSelectedAll=checkBoxFour.isSelected();
		assertTrue(checkBoxFourSelectedAll,"check box Four  is not Selected");
		selectAllButton.click();
		boolean checkBoxOneDeSelectedAll=checkBoxOne.isSelected();
		assertFalse(checkBoxOneDeSelectedAll,"check box one  is  Selected");
		boolean checkBoxTwoDeSelectedAll=checkBoxTwo.isSelected();
		assertFalse(checkBoxTwoDeSelectedAll,"check box Two  is  Selected");
		boolean checkBoxThreeDeSelectedAll=checkBoxThree.isSelected();
		assertFalse(checkBoxThreeDeSelectedAll,"check box Three  is  Selected");
		boolean checkBoxFourDeSelectedAll=checkBoxFour.isSelected();
		assertFalse(checkBoxFourDeSelectedAll,"check box Four  is  Selected");
	}

}
