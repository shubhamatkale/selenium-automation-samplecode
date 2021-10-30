package comman;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

	public static ThreadLocal<ChromeDriver> chrome=new ThreadLocal<>();//Thread local use only for parallel execution in xml file.

}
