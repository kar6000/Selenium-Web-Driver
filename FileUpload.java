package com.webdriver.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys(" ");
		

	}

}
