package progs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		List<WebElement> allHeaders =	driver.findElements(By.id("//table[contains(@summary,'Sample')]//th"));
		
		System.out.println(allHeaders.size());
		
		for(WebElement ele : allHeaders) {
			System.out.println(ele.getText());
		}
	}

}
