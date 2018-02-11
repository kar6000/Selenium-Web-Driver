package com.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmBox {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver driver = new FirefoxDriver();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();
		Thread.sleep(3000);

		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//driver.quit();
		driver.close();

	}

}
