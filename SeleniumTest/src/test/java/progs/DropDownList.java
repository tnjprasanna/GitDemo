package progs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchOption = driver.findElement(By.xpath("//input[@name='q']"));
		searchOption.click();
		searchOption.sendKeys("java");
		Thread.sleep(1000);
		
	
		List<WebElement> allOptions = driver.findElements(By.xpath("(//*[@role='listbox'])[1]"));
		
		for(WebElement ele : allOptions ) {
			
			if(ele.getText().contains("javatpoint")) {
				ele.click();
				break;
			}
		}

	}

}