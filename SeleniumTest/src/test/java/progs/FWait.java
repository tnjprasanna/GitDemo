package progs;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elementLoc = By.xpath("//h3[text()='Selenium']");
		waitForElementFW(driver,elementLoc);

	}
	
	public static WebElement waitForElementFW(WebDriver driver, By locator) {
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver) 
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);			
		
		WebElement element = mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply (WebDriver driver) {
				return driver.findElement(By.xpath(""));
			}
			
		});
		
		
		return element;
		
		
	}

}
