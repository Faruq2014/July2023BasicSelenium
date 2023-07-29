package com.facebook_Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DirectLocators implements SearchContext {

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void id() {
		driver.findElement(By.id("email")).sendKeys("suman");
		driver.findElement(By.id("pass")).sendKeys("suman123");
	}

	 @Test
	public void name() {
		driver.findElement(By.name("login")).sendKeys("hello");
		;

	}

	 @Test
	public void linkText() {
		driver.findElement(By.linkText("Español")).click();

	}

	 @Test
	public void partialLinkText() {
		driver.findElement(By.partialLinkText("Français")).click();

	}
	 

}
