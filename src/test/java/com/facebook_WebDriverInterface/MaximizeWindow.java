package com.facebook_WebDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaximizeWindow {
WebDriver driver;
	
	@BeforeTest	
public void intializeApplication() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		// how do you maximize window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void loginTest() {
		
	}
	
}
