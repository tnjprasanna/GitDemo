package com.pages.com;

import org.openqa.selenium.WebDriver;

public class SignIn_Action {
	
	 public static void Execute(WebDriver driver){

		// driver.manage().window().maximize();

		 LoginPage_New.txtBox_userName(driver).sendKeys("testuser_1");
		 LoginPage_New.txtBox_Password(driver).sendKeys("Test@123");
		
		 try {
			 LoginPage_New.clickLoginButton(driver).click();
		 } catch (Exception e) {
			 System.err.println("******Register element is not found*****");
			// throw(e);
			 System.out.println("Not able to Login.....");
		 }

		   
	 }

}
