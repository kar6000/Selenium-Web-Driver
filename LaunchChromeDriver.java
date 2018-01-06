package com.webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumRC\\Tools\\Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		

	}

}
