package progs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert JSalertWindow = driver.switchTo().alert();
		System.out.println(JSalertWindow.getText());
		JSalertWindow.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert ConfirmalertWindow = driver.switchTo().alert();
		System.out.println(ConfirmalertWindow.getText());
		ConfirmalertWindow.accept();
		
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		System.out.println(ConfirmalertWindow.getText());
		ConfirmalertWindow.dismiss();
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert PromptalertWindow = driver.switchTo().alert();
		System.out.println(PromptalertWindow.getText());
		String sendText = "Test text";
		Thread.sleep(3000);
		PromptalertWindow.sendKeys(sendText);
		PromptalertWindow.accept();
		String dispText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(dispText);
		Assert.assertEquals(sendText, dispText);
	}

}
