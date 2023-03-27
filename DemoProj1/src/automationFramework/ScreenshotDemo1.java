package automationFramework;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo1 {
	
	 public static void main(String[] args) {
	        //set the location of chrome browser
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        
	        // Initialize browser
	        WebDriver driver = new ChromeDriver();
	        
	        //navigate to url
	        driver.get("https://demoqa.com");
	        
	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        // capture screenshot and store the image
	        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	        ImageIO.write(s.getImage(),"PNG",new File("C:\\projectScreenshots\\fullPageScreenshot.png"));
	        
	        
	        //closing the webdriver
	        driver.close();
	        
			/*
			 * WebDriverManager.chromedriver() .version("83.0.0") .arch32()
			 * .proxy("proxyhostname:80") .proxyUser("username") .proxyPass("password")
			 * .setup();
			 */
	    }

}
