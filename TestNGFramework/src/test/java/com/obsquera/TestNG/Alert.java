package com.obsquera.TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class Alert  extends Base{
@Test
	public void simpleAlert()
	{ 	
	
		String expectedAlertText="I am a Javascript alert box!";
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement simplealertBoxClickMeButton=driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
		simplealertBoxClickMeButton.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		assertEquals(expectedAlertText,alertText,"Alert Text Message is incorrect");
		driver.switchTo().alert().accept();
	}

@Test
public void simpleConfirmAlert()
{
	String expectedOkMessage="You pressed OK!";
	String expectedCancelMessage="You pressed Cancel!";
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement simpleConfirmalertBoxClickMeButton=driver.findElement(By.xpath("//button[contains(@class,'btn btn-warning')]"));
	simpleConfirmalertBoxClickMeButton.click();
	driver.switchTo().alert().accept();
	String simpleConfirmOkMessage=driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();
	assertEquals(expectedOkMessage,simpleConfirmOkMessage,"simple Confirm Ok Message is not same as expected");
	
	simpleConfirmalertBoxClickMeButton.click();
	driver.switchTo().alert().dismiss();
	String simpleConfirmCancelMessage=driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();
	assertEquals(expectedCancelMessage,simpleConfirmCancelMessage,"simple Confirm cancel Message is not same as expected");
}


@Test
public void simplePromptBox()
{
	String expectedPromptResultMessage="You have entered 'Globy' !";
	WebElement simplePromptBox=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
	simplePromptBox.click();
	driver.switchTo().alert().sendKeys("Globy");
	driver.switchTo().alert().accept();
	//Thread.sleep(1000);
	WebElement actualPromptResultMessageField=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
	String actualPromptResultMessage=actualPromptResultMessageField.getText();
	assertEquals(expectedPromptResultMessage,actualPromptResultMessage,"actual Prompt Result Message is not same as expected");
}

}
