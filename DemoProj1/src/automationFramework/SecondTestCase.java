package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void launchBrowser() {
		
		//driver.get("https://demoqa.com/text-box/");
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	}
	

	public void inputFields() {
		
		List<WebElement> inputElements = driver.findElements(By.tagName("input"));
		
		int size = inputElements.size();
		System.out.println(size);
		if(size != 0) {
			
			for(WebElement element : inputElements ) {
				
				System.out.println(element.getAttribute("placeholder"));
				
			}
			
		}
			
	}
	
	@Test
	public void dropDown() {
		
	 	//WebElement listElement = driver.findElement(By.xpath("//div[contains(@class,' css-1wa3eu0-placeholder')]"));
	 	//listElement.click();
		
		String val = driver.findElement(By.cssSelector("select#oldSelectMenu>option:nth-of-type(1)")).getText();
		System.out.println(val);
			//Select selCSS = new Select(driver.findElement(By.cssSelector("select#oldSelectMenu>option:nth-of-type(2)")));
			
			/*
	 		Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
	 		
	 		sel.selectByValue("10");
	 		sel.selectByIndex(4);
	 		sel.selectByVisibleText("Magenta");
	 		
	 		List<WebElement> opt = sel.getOptions();
	 		
			
			 * for(int size=0; size< opt.size(); size++ ) {
			 * System.out.println(opt.get(size).getText()); }
			
	 		
	 		for(WebElement options : opt) {
	 			
	 			System.out.println(options.getText());
	 		} */
	 	
	}

}
