package automationFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeFormModifiedPageObject {
	
	@FindBy(how = How.NAME, using = "firstname")
	public WebElement firstName;

	@FindBy(how = How.NAME, using = "firstname")
	@org.openqa.selenium.support.CacheLookup
	public WebElement firstNameCached;

}
