package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWait {
	WebDriver driver;
	@BeforeTest
		
	public void openFacebook() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//what is implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//if can not find in 10 seconds = no such element found exception
		//if can find in before 10 seconds   = do not wait 10 seconds go to next line
		//write once == implementing on all the find element methods
		
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("sujr234@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("suman123");
		driver.findElement(By.name("login")).click();
		
	}

}
