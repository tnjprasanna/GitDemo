package automationFramework;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows/");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored
		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver arg0) {
						System.out.println("Checking for the element!!");
						WebElement element = arg0.findElement(By.id("target"));
						if(element != null)
						{
							System.out.println("Target element found");
						}
						return element;
					}
				};

		wait.until(function);


	}

}
