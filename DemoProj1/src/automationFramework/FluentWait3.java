package automationFramework;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows/");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored

		Predicate<WebDriver> predicate = new Predicate<WebDriver>()
				{

					public boolean apply(WebDriver arg0) {
						WebElement element = arg0.findElement(By.id("colorVar"));
						String color = element.getAttribute("color");
						System.out.println("The color if the button is " + color);
						if(color.equals("red"))
						{
							return true;
						}
						return false;
					}
				};
				wait.until(predicate);

	}

}
