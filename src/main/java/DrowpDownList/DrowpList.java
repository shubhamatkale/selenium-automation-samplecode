package DrowpDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
 
public class DrowpList {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
        
	    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    
	    WebElement E=driver.findElement(By.name("systemUser[userType]"));
	    Select s=new Select(E); 
	   // s.selectByVisibleText("ESS"); //by Text
	    s.selectByIndex(0);  //By index value
	    
	    WebElement E1=driver.findElement(By.id("systemUser_status"));
	    Select s1=new Select(E1);
        s1.selectByVisibleText("Disabled");

        
    
	    
	}
}
