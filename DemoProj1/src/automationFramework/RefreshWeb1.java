package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWeb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		 
		  driver.get("https://google.com");
		  //Locate the search text box
		  WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		  //Refresh the web page
		  driver.navigate().refresh();
		  //Pass string using sendkeys to the web element
		  ele.sendKeys("Testing String");
		  driver.quit();

	}

}
