package comman;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	
	@BeforeMethod
	public void beforeTestExecution() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\selenium\\\\\\\\chromedriver.exe");
		 WebDriverFactory.chrome.set(new ChromeDriver());
		 WebDriverFactory.chrome.get().get("https://opensource-demo.orangehrmlive.com/");
		 WebDriverFactory.chrome.get().manage().window().maximize();

	}
	

	@AfterMethod
	public void afterTestExecution()
	{
		WebDriverFactory.chrome.get().quit();
	}
}
