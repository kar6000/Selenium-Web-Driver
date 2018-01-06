package com.webdriver.methods;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Dynamic wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);//Static wait
		
		Alert alert =driver.switchTo().alert();//Use Alert API and swich to Alert
		System.out.println("The alert text is:  "+alert.getText());//get text of Alert
		
		String text =alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert");
		}else {
			System.out.println("Incorrect alert");
		}
				
		alert.accept();//click on OK button
		//alert.dismiss();//click on Dismiss button
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
