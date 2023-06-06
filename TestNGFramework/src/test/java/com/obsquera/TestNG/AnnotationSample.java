package com.obsquera.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSample extends Base{

	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod Test case");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod Test case");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Test case");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Test case");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass Test case");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass Test case");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite Test case");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite Test case");
	}
	}
	

