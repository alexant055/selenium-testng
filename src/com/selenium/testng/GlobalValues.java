package com.selenium.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/data.properties");
		
		properties.load(fis);
		
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		properties.setProperty("browser", "firefox");
		System.out.println(properties.getProperty("browser"));
	}

}
