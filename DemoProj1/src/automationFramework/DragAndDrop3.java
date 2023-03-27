package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Note: Following statement is required since Selenium 3.0, 
		//optional till Selenium 2.0
		//Set system properties for geckodriver 
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");		

	WebDriver driver = new ChromeDriver();
	 
	String URL = "https://demoqa.com/draggable/";
	 
	driver.get(URL);
	 
	// It is always advisable to Maximize the window before performing DragNDrop action		 
	driver.manage().window().maximize();
	 
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
	//Actions class method to drag and drop			
	Actions builder = new Actions(driver);
	 
	WebElement from = driver.findElement(By.id("draggable"));
	
	//Perform dragAndDropBy 
	builder.dragAndDropBy(from, 100,100).perform();		

	System.out.println("Dropped");

	driver.close();

	}

}
