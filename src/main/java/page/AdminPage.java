package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comman.WebDriverFactory;

public class AdminPage {

	@FindBy(id="btnAdd")
	WebElement addButton;
	 
	WebDriverWait wait;
	
	public AdminPage() {
		PageFactory.initElements(WebDriverFactory.chrome.get(),this);
		wait=new WebDriverWait(WebDriverFactory.chrome.get(),5);
	}
	
	
	public AddUserPage navigetToAddUserPage()
	{
		addButton.click();
		
		return new AddUserPage();
	}
	public AdminPage isPageLoaded()
	{
		
		wait.until(ExpectedConditions.visibilityOf(addButton));
		return this; 		
	}
}
