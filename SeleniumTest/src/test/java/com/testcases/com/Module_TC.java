package com.testcases.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.com.SignIn_Action;

public class Module_TC {

	 private static WebDriver driver = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		SignIn_Action.Execute(driver);
		//https://shop.demoqa.com/
	}

}
