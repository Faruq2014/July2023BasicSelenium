package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;//instance variable
	
	@Test
	public void openBrower() {
		WebDriver driver = new ChromeDriver();
		
		//WebDriver=data type/parent
		//ChromeDriver= child class of WebDriver//implementation class
	}
	
	
	@Test
	public void openApplication() {
		//how do you open application
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
