package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");

		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		//Switch by Index
		driver.switchTo().frame(0);
		driver.quit();
		
		//Switch by frame name
		driver.switchTo().frame("iframe1");
		
		//Switch by frame name
		driver.switchTo().frame("iframe1");
		driver.quit();
		
		//Switch by frame ID
		driver.switchTo().frame("IF1");
		driver.quit();
		
		WebElement iframeElement = driver.findElement(By.id("IF1"));
		//now use the switch command
		driver.switchTo().frame(iframeElement);
		
		//First find the element using any of locator stratedgy
				WebElement iframeElement1 = driver.findElement(By.id("IF1"));

				//now use the switch command
				driver.switchTo().frame(0);

				//Do all the required tasks in the frame 0
				//Switch back to the main window
				driver.switchTo().defaultContent();
				
		driver.quit();

	}

}
