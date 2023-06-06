package com.obsquera.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Menu{
	
	@Test
	public void radioButton()
	{   
		String expectedShowSelectedValueButton="Radio button 'Female' is checked";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadioButtonSelectedStatus=maleRadioButton.isSelected();
		assertFalse(maleRadioButtonSelectedStatus,"male Radio Button Selected Status is selected");
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadioButtonSelectedStatus=femaleRadioButton.isSelected();
		assertFalse(femaleRadioButtonSelectedStatus,"female Radio Button Selected Status is selected");
		femaleRadioButton.click();
		boolean femaleRadioButtonSelectedStatus2=femaleRadioButton.isSelected();
		assertTrue(femaleRadioButtonSelectedStatus2,"female Radio Button Selected Status is not selected");
		WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement actualShowSelectedValueMessageField=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualShowSelectedValueMessageDisplayed=actualShowSelectedValueMessageField.getText();
		assertEquals(expectedShowSelectedValueButton,actualShowSelectedValueMessageDisplayed,"Male is selected");
		
	}

}
