package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void WebLogin() {
		System.out.println("Car loan web login!");
	}

	@Parameters({"url"})
	@Test(groups= {"Smoke"})
	public void MobileLogin(String url) {
		System.out.println("Car loan mobile login!");
		System.out.println(url);
	}

	@Test(timeOut=4000)
	public void APILogin() {
		System.out.println("Car loan api login!");
		Assert.assertTrue(false);
	}

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I'm executing before test!");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I'm executing after test!");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I'm executing before suite!");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I'm executing after suite!");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I'm executing before method!");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I'm executing after method!");
	}
	
	@Test(dataProvider="getData")
	public void dataProdviderTest(String userName, String password) {
		System.out.println("Data provider test");
		System.out.println(userName);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
