package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTestCase {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/login");
		driver.manage().window().maximize();
		System.out.println("web page launched ");
		//driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println("Title is: " +title);
		
		int titleLen = driver.getTitle().length();
		System.out.println("Title is: " +titleLen);
		
		WebElement uName = driver.findElement(By.id("userName"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		//WebElement logOutBtn = driver.findElement(By.xpath("(//button[@id='submit'])[1]"));
		
		uName.sendKeys("testuser");
		pwd.sendKeys("Password@123");
		String att = loginBtn.getAttribute("type");
		System.out.println(att);
		
		loginBtn.click();
		
		/*
		 * try { if(logOutBtn.isDisplayed()) { logOutBtn.click();
		 * System.out.println("Logged out successfully...."); } } catch (Exception e) {
		 * System.out.println("Incorrect Login");
		 * 
		 * }
		 */
		
		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]")).click();
		System.out.println("Forms has clicked");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[contains(@class,'btn-light')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("//input[@id='firstName']")).click();
		driver.findElement(By.id("//input[@id='firstName']")).sendKeys("Prasanna");
		driver.findElement(By.id("//input[@id='lastName']")).sendKeys("Venkatesan");
		
		driver.findElement(By.id("//input[@id='userEmail']")).sendKeys("Venkatesan@gmail.com");
		driver.findElement(By.xpath("//input[@name='gender' and @value='Male']")).click();
		
		
		driver.findElement(By.id("//input[@id='userNumber']")).sendKeys("9987876552");
		
		driver.findElement(By.id("//input[@id='dateOfBirthInput']"));
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'February 13th, 2023')]")).click();
		
		driver.findElement(By.xpath("//div[@id='subjectsContainer']//div[2]")).sendKeys("Test Subject 1");
		
		//driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::label[contains(text(),'Sports')]")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
		
		//driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		
		
		
		
		//driver.quit();
		
	}

}
