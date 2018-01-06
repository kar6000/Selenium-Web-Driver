package com.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIndeed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.indeed.com/");
		
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='text-input-what']")).clear();
		driver.findElement(By.xpath(".//*[@id='text-input-what']")).sendKeys("Selenium Tester");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='text-input-where']")).clear();
		driver.findElement(By.xpath(".//*[@id='text-input-where']")).sendKeys("san jose");
		
		driver.findElement(By.xpath(".//*[@id='whatWhere']/form/div[3]/button")).click();

	}

}
