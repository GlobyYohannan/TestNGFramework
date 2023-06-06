package com.obsquera.TestNG;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoItSampleClass extends Base{
	
	public void autoItSampleFileUpload() throws IOException, InterruptedException
	
	{   String expectedUploadDocText="sample.docx";
		String expectedUploadMessage="WORD file has been converted to PDF";
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		WebElement selectWordFile=driver.findElement(By.xpath("//div[@id='uploader']//child::a[contains(@class,'uploader__btn tooltip--left active')]"));
		selectWordFile.click();
		
		Runtime.getRuntime().exec("G:\\AutoIT\\FileUpload.exe");
		
		//Thread.sleep(2000);
		//String uploadedDocText=driver.findElement(By.xpath("//div[contains(@class,\"file file--officepdf tooltip--top tooltip\")]//child::div[@class='file__info']//child::span")).getText();
		//assertEquals(expectedUploadDocText,uploadedDocText,"File is not uploaded properly");
		
		//WebElement convertWordToPdf=driver.findElement(By.xpath("//button[@id='processTask']"));
		
		//Thread.sleep(2000);
		
		//String actualUploadMessage=driver.findElement(By.xpath("//h1[@class='title2']")).getText();
		//assertEquals(expectedUploadMessage,actualUploadMessage,"File is not uploaded");
	}
	@Test
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadfile_0' and @class='upload_txt']"));
		chooseFile.sendKeys("G:\\sample.docx");
	}

}
