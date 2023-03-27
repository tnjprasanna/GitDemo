package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_New {
	
	private static WebElement element = null; 
	
	
	public static WebElement txtBox_userName(WebDriver driver) {
		
		element = driver.findElement(By.id("userName"));
		return element;
	}
	
	public static WebElement txtBox_Password(WebDriver driver) {
		
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement clickLoginButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@id='Login']")); 
		return element;
	}
	
	

}
