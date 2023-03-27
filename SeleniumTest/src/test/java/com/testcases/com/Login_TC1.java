package com.testcases.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.com.Dashboard;
import com.pages.com.HomePage;
import com.pages.com.LoginPage;

public class Login_TC1 {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	HomePage homePage = new HomePage(driver);
		
		LoginPage loginPage = new LoginPage(driver);
		
		Dashboard dashBoard = new Dashboard(driver);
		
		//homePage.clickLoginLink();
		
		//Enter username & password
		loginPage.enterUsername("testPV");
		loginPage.enterPassword("Test@123");
		loginPage.clickLogin();
		Thread.sleep(3000);
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashBoard.getHeading());
		
		//Click on Logout button
		dashBoard.clickLogout();

        //Close browser instance
        driver.quit();
		
	}
	
	
	

}
