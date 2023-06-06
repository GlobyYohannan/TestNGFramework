package com.obsquera.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Asserts extends Base{
	
	@Test
	public void assertEqualsSample()
	{
		String input="Globy";
		String expectedYourMessageText="Your ssa	0 : "+input;
		
		WebElement singleInputTextField1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField1.sendKeys(input);
		WebElement showMessageButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton1.click();
		String yourMessageText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		
		assertEquals(expectedYourMessageText,yourMessageText,"Message Generated is not Same after entering text on single input field");
	}
	
	@Test
	public void assertNotEqualsSample()
	
	{
		String actualValue="abc";
		String expectedValue="123";
		
		
		assertNotEquals(expectedValue,actualValue,"expected and actual are same");
	}
	
	@Test
public void assertTrueSample()
	
	{
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean singleInputTextFieldIsDisplayed=singleInputTextField.isDisplayed();
		assertTrue(singleInputTextFieldIsDisplayed,"single Input Text Field Is not Displayed");
	}
	
	@Test
public void getTotalButtonIsDispayedAssertion()
	
	{
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getTotalButtonIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(getTotalButtonIsDisplayed,"get Total Button Is not Displayed");
	}
	
	@Test
	public void showMessageButtonWidthAssertion()
		
		{
		int expectedshowMessageButtonWidth=136;
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		Dimension showMessageButtonSize=showMessageButton.getSize();
		int showMessageButtonHeight=showMessageButtonSize.getHeight();
		int showMessageButtonWidth=showMessageButtonSize.getWidth();
		assertEquals(expectedshowMessageButtonWidth,showMessageButtonWidth,"show Message Button Width is not correct");
		}

	@Test
	public void showMessageButtonColorAssertion()
	
	{
	String expectedshowMessageButtonColor= "#007bff";
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String showMessageButtonBackGroundColor=showMessageButton.getCssValue("background-color");
	String hex = Color.fromString(showMessageButtonBackGroundColor).asHex();
	System.out.println(hex);
	assertEquals(hex,expectedshowMessageButtonColor,"show Message Button color is not correct");
	}
	
	@Test
	public void assertFalseSample()
	{
		boolean flag=false;
		assertFalse(flag,"assert False Sample is True");
	}
@Test
	public void assertNullSample()
	{
		String value=null;
		assertNull(value,"assert value is not null");
	}

@Test
public void assertNotNullSample()
{
	String value="name";
	assertNotNull(value,"assert value is not null");
}
}
