package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comman.WebDriverFactory;

	public class AddUserPage {
		@FindBy(id="systemUser_employeeName_empName")
		WebElement empName;
		@FindBy(id="systemUser_userName")
		WebElement userName;
		@FindBy(id="systemUser_password")
		WebElement password;
		@FindBy(id="systemUser_confirmPassword")
		WebElement confirmPassword;
		@FindBy(id="btnSave")
		WebElement saveButton;
		
		public AddUserPage()
		{

			PageFactory.initElements(WebDriverFactory.chrome.get(), this);

		}
		public void addUserInfo()
		{
			empName.sendKeys("Alice Duval");
			userName.sendKeys("user013");
			password.sendKeys("admin123");
			confirmPassword.sendKeys("admin123");
			saveButton.click();
		}


}
