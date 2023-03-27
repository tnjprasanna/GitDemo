package progs;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenlinks = 0;
		
		for(WebElement element : links) {
			
			String url = element.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			
			URL link = new URL(url);
			
			try {
				HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
				httpConn.connect();
				if(httpConn.getResponseCode()>=400) {
					
					System.out.println(httpConn.getResponseCode()+ url +" is"+" Broken link");
					brokenlinks++;
				} else {
					
					System.out.println(httpConn.getResponseCode()+ url +" is"+" Valid link");
				}
				
			} catch (Exception e) {
				
			}	
		}
		System.out.println("Number of Broken Links: "+brokenlinks);
	}

}
