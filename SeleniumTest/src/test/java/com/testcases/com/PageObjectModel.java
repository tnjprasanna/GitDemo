package com.testcases.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.com.LoginPage_New;

public class PageObjectModel {
	
	private static WebDriver driver = null; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://demoqa.com/login");
		
		LoginPage_New.txtBox_userName(driver).sendKeys("testPV");
		LoginPage_New.txtBox_Password(driver).sendKeys("Test@123");
		LoginPage_New.clickLoginButton(driver).click();

	}

}
