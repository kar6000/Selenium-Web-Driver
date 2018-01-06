package com.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.half.ebay.com");
		
		//page load time out(Dynamic wait)
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicit wait is applicable for all the elements in the page. Ex- page is loaded but "go" button is not available
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
