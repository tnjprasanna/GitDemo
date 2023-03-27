package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	//Locator for login link
	By LoginLink = By.xpath("//span[contains(text(),'Login')]");
	
	// Click Login Button
	By loginBtn = By.xpath("//button[@id='login']");
	
	//Method to click login button
	public void clickLoginLink() {
		//driver.findElement(LoginLink).click();
	}
	
	/*
	 * public void clickLoginButton() { driver.findElement(loginBtn).click(); }
	 */

}
