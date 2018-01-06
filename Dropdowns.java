package com.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement dropDown = driver.findElement(By.id("month"));
		System.out.println("dropdown is displayed  :" + dropDown.isDisplayed());
		System.out.println("dropdown is enabled  :" + dropDown.isEnabled());
		System.out.println("dropdown text  :" + dropDown.getText());

		WebElement dropDown2 = driver.findElement(By.id("day"));
		System.out.println("dropdown is selected  " + dropDown2.isSelected());
		System.out.println("dropdown text " + dropDown2.getText());

		//dropDown.isDisplayed();
		//dropDown.isEnabled();
		//dropDown.isSelected();
		//dropDown.getText();

		driver.close();

	}

}
