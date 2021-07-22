package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonalLoan {

	@Test(enabled=false)
	public void WebLogin() {
		System.out.println("Personal loan web login!");
	}

	@Test(groups= {"Smoke"})
	public void MobileLogin() {
		System.out.println("Personal loan mobile login!");
	}

	@Test
	public void MobileSignin() {
		System.out.println("Personal loan mobile Sign login!");
	}

	@Test
	public void MobileSignOut() {
		System.out.println("Personal loan mobile signout!");
	}

	@Test(dependsOnMethods={"MobileSignin", "MobileSignOut"})
	public void APILogin() {
		System.out.println("Personal loan api login!");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I'm executing before class!");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I'm executing after class!");
	}

}
