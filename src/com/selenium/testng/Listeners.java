package com.selenium.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successful Testcase!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Testcase!");
	}

}
