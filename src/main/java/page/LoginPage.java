package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import comman.WebDriverFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(WebDriverFactory.chrome.get(),this);
	}
	
	public HomePage login(String struserName, String strpassword) {
		
		userName.sendKeys(struserName);
		password.sendKeys(strpassword);
		loginButton.click();
		return new HomePage();
	}
	
	
	
}
