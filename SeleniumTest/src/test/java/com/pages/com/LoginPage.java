package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Locator for username field
	By uName = By.id("userName");
		
	//Locator for password field
	By pswd = By.id("password");
		
	//Locator for login button
	By loginBtn = By.xpath("//button[@id='login']");
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

}
