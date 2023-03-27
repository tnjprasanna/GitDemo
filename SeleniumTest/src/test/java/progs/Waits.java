package progs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		By eleLocator = By.xpath("");
		waitForElementToPresent(driver, eleLocator, 10).click();
		
		

	}
	
	public static WebElement waitForElementToPresent(WebDriver driver, By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElement(locator);
		
		
		
	}
}
