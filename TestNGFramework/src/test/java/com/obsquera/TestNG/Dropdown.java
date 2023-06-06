package com.obsquera.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Base{
	@Test
	public void selectInputDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement selectColorDropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectColorDropdown);
		select.selectByIndex(1);
		select.selectByValue("Yellow");
		select.selectByVisibleText("Green");
		List<WebElement> options=select.getOptions();
		for(WebElement dropdownOption: options )
		{
			String dropdownOptionText=dropdownOption.getText();
			System.out.println(dropdownOptionText);
		}
	}
	
	@Test
	public void dropdownWithoutSelectOption()
	{
		String expectedLanguage="中文简体";
		driver.navigate().to("https://www.selenium.dev/");
		WebElement languageDropdown=driver.findElement(By.xpath("//li[contains(@class,'nav-item dropdown d-none d-lg-block')]//child::a[@id='navbarDropdown']"));
		languageDropdown.click();
		WebElement languageDropdownOptions=driver.findElement(By.xpath("//div[contains(@class,'dropdown-menu show')]"));
		List<WebElement> languageDropdownOptionsList=languageDropdownOptions.findElements(By.tagName("a"));
		
		for(WebElement language:languageDropdownOptionsList) 
		{
			String actualLanguage=language.getText();
			if(actualLanguage.equals(expectedLanguage))
			{
				language.click();
				System.out.println(actualLanguage);
				break;
			}
		}
	}

}
