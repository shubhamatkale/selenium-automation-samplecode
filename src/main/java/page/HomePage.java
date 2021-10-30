package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import comman.WebDriverFactory;

public class HomePage {

	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	 
	WebDriverWait wait;
	
	public HomePage() {
		PageFactory.initElements(WebDriverFactory.chrome.get(), this);
		wait=new WebDriverWait(WebDriverFactory.chrome.get(),10);
	}
	public  HomePage verifyWelcomeTextVisible() {
		Assert.assertEquals(welcome.isDisplayed(),true,"Text Is Not Visible");
		wait=new WebDriverWait(WebDriverFactory.chrome.get(),10);
		return this;
	}
	 public AdminPage navigetToadminPage() {
		 
		 adminTab.click();
		 return new AdminPage();
		 
	 }
	 public HomePage isPageLoaded()
		{
			wait.until(ExpectedConditions.visibilityOf(welcome));
			wait.until(ExpectedConditions.visibilityOf(adminTab));
			return new HomePage();
	     }
	
	
}
