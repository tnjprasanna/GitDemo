package automationFramework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CacheLookup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In order to understand how action on WebElements using PageObjects work,
		// we will save all the logs of chrome driver. Below statement helps us
		// save all the logs in a file called TestLog.txt
		
		System.setProperty("webdriver.chrome.logfile", "TestLog.txt");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/automation-practice-form/");

		PracticeFormModifiedPageObject pageObject = PageFactory.initElements(driver, PracticeFormModifiedPageObject.class);
		// set some text to fetch it later
		pageObject.firstName.sendKeys("Virender");

		// We will first try to get Text from the WebElement version which is not cached.
		// We will measure the time to perform 1000 getText operations
		long withoutCacheStartTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i ++)
		{
			pageObject.firstName.getText();
		}
		long withoutCacheEndTime = System.currentTimeMillis();
		System.out.println("Time take in seconds Without cache " + ((withoutCacheEndTime - withoutCacheStartTime)/ 1000));

		// Let us now repeat the same process on the cached element and see
		// the amount of time it takes to perform the same operation 1000 times
		long withCacheStartTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i ++)
		{
			pageObject.firstNameCached.getText();
		}
		long withCacheEndTime = System.currentTimeMillis();
		System.out.println("Time take in seconds With cache " + ((withCacheEndTime - withCacheStartTime)/ 1000));

		driver.close();
		driver.quit();

	}
	
	

}
