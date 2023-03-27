package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWeb2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		 
		  driver.get("https://google.com");
		  //Locate the search text box
		  WebElement ele = driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]"));
		  //Refresh the web page
		  driver.navigate().refresh();
		  
		  try {
		  //Pass string using sendkeys to the web element
		  ele.sendKeys("Testing String");
		  }
		  catch(StaleElementReferenceException e) {
			  WebElement elem = driver.findElement(By.xpath("//input[@class='gLFyf']"));
			  elem.sendKeys("Testing String from catch block");
			  //Fetching the string entered in the search text box
			  String str = elem.getAttribute("value");
			  System.out.println("The string entered from catch block is - " +str);
		  }
		  
		  driver.quit();
		
	}
	 

}
