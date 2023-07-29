package com.facebook_Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListOfElements {
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void findElements() {
		WebElement ParentPageLink = driver.findElement(By.id("pageFooterChildren"));

		WebElement childLink = ParentPageLink.findElement(By.tagName("ul"));

	   List<WebElement> grandChild = childLink.findElements(By.tagName("li"));
		System.out.println(grandChild.size());
		
		
		
		
		
		
		
		int a[]= {1,2 ,3};
		int b =1;
		int b1 =2;
		int b2 =3;
		String pl[]= {"signin ","massenger","post"};
		
	}

}
