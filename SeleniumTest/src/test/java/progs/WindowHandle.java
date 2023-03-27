package progs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> webLink = driver.findElements(By.tagName("a"));
		System.out.println(webLink.size());
		int webLinksize = webLink.size();
		
		for(int i=0;i<webLinksize;i++) {
			System.out.println(webLink.get(i).getText());
			
			String linkText = webLink.get(i).getText();
			if(linkText.contains("OrangeHRM")) {
				webLink.get(i).click();
				System.out.println("OrangeHRM has clicked");
			}
		}
		
		/*
		WebElement link =  driver.findElement(By.partialLinkText("//a[contains(text(),'OrangeHRM')]"));
		System.out.println(link.getText());
		link.click();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator<String> it = allWindow.iterator();
		it.next();
		it.next();
		*/
	}

}
