package progs;

import java.time.Duration;
import java.util.ArrayList;

import org.checkerframework.common.value.qual.ArrayLen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/calendar/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ctxmenu'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[text()='1 month per page']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		int rowCount = driver.findElements(By.xpath("//table[@id='mct1']/tbody/tr")).size();
		//System.out.println("rowCount is: "+rowCount);
		int colCount = driver.findElements(By.xpath("//table[@id='mct1']/tbody/tr[2]//thead/tr/td")).size();
		//System.out.println("colCount: "+colCount);
		
		String priceClose = driver.findElement(By.xpath("//table[@id='mct1']//tr[2]/td[3]")).getText();
		//System.out.println(priceClose);
		
		for(int row =1; row <= 1;row++) {
			//System.out.println("row: "+ row);
			for(int col = 1; col <= colCount; col++) {
				
				//System.out.print("col: "+col +" ");
				String rowText = driver.findElement(By.xpath("//table[@id='mct1']/tbody/tr[2]//thead/tr/td["+col+"]")).getText();
				System.out.print(rowText+"\t");
				
				//if(col==7) {break;}
				
			}System.out.println();
		}
		
		for(int row =1; row <= rowCount;row++) {
			//System.out.println("row: "+ row);
			for(int col = 1; col <= colCount; col++) {
								
				String text = driver.findElement(By.xpath("//table[@id='mct1']/tbody/tr[2]//tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(text+"\t");
				
			}System.out.println();
		}
	}

}
