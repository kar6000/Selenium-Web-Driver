package com.webdriver.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopUps {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Set<String> handler =driver.getWindowHandles();//handler has 2 window ids
		
		Iterator<String> it =handler.iterator();
		
		String parentwindwid=it.next();
		System.out.println("parent window Id: "+parentwindwid);
		String childwindowid =it.next();
		System.out.println("Child windio id is  "+childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println("child window pop up title:  "+ driver.getTitle());
		
		driver.switchTo().window(parentwindwid);
		System.out.println("Parent window title is "+driver.getTitle());
		driver.close();		

	}

}
