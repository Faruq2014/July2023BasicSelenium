package com.facebook_Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void findElementsByForLoop() {
		WebElement grandpa = driver.findElement(By.id("pageFooterChildren"));
		WebElement parent = grandpa.findElement(By.tagName("ul"));
		List<WebElement> child = parent.findElements(By.tagName("li"));
		int totalChilds = child.size();
		System.out.println("Total links " + totalChilds);
		int acutalSize = 31;
		Assert.assertEquals(totalChilds, acutalSize);

		// print all the links
		for (int i = 0; i < totalChilds; i++) {
			// System.out.print(i);
			System.out.println(i + " link is " + child.get(i).getText());
            
		}
		// test the link

		for (int i = 0; i < totalChilds; i++) {

			if (child.get(i).getText().equalsIgnoreCase("Contact Uploading & Non-Users")) {
				child.get(i).click();

			}
		}

		//assertion
		
		for (int i = 0; i < totalChilds; i++) {

			if (child.get(i).getText().equalsIgnoreCase("Contact Uploading & Non-Users")) {
				boolean expectedlinkText = child.get(i).getText().equalsIgnoreCase("Contact Uploading & Non-Users");
				Assert.assertTrue(expectedlinkText);
				child.get(i).click();
			}
		}
	}

}
