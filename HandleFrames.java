package com.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		// can access the frame by index or by name of the Frame

		WebDriver driver = new FirefoxDriver();
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("ipsita");
		driver.findElement(By.name("password")).sendKeys("kunmun2008");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		//static wait
		Thread.sleep(5000);
		//Frame method is a overloaded Method, it takes name(String) or index(int)
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.close();
		
	}

}
