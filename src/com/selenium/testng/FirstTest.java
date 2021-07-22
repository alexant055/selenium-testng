package com.selenium.testng;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(groups= {"Smoke"})
	public void printDemo() {
		System.out.println("Test!");
	}

}
