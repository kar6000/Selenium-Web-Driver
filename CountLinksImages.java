package com.webdriver.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinksImages {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// count the no of links
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links are: " + linkcount.size());

		// Display the links

		for (int i = 0; i < linkcount.size(); i++) {
			String linkText = linkcount.get(i).getText();
			System.out.println(linkText);
		}
		// count all images

		List<WebElement> imageCount = driver.findElements(By.tagName("img"));
		System.out.println("Total images are :" + imageCount.size());

		driver.close();

	}

}
