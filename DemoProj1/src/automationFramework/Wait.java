package automationFramework;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // launch Chrome and redirect it to the URL
	       	driver.get("https://demoqa.com/dynamic-properties");

	        //This element will appear after 5 secs
		driver.findElement(By.id("visibleAfter")).click();

	        //close browser
	        driver.close();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("alert('hello world');");
		((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		/*
		 * alertIsPresent() elementSelectionStateToBe() elementToBeClickable()
		 * elementToBeSelected() frameToBeAvaliableAndSwitchToIt()
		 * invisibilityOfTheElementLocated() invisibilityOfElementWithText()
		 * presenceOfAllElementsLocatedBy() presenceOfElementLocated()
		 * textToBePresentInElement() textToBePresentInElementLocated()
		 * textToBePresentInElementValue() titleIs() titleContains() visibilityOf()
		 * visibilityOfAllElements() visibilityOfAllElementsLocatedBy()
		 * visibilityOfElementLocated()
		 */
		
	}

}
