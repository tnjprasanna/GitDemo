package progs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys("Toronto");
		String text = null;
		
		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			text = searchBox.getAttribute("value");
			
			if(text.equals("Toronto, ON, Canada")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
		}	while(!text.isEmpty());

	}

}
