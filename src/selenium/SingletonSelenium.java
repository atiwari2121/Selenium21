package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SingletonSelenium {

	private static WebDriver driver;

	private SingletonSelenium()
	{

	}

	public static WebDriver getInstance(int selectBrowser)
	{
		if(driver == null)
		{
			if (selectBrowser == 1) {
				System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Workspace\\Setups\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();	
			} 

			else if (selectBrowser == 2) {
				System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Workspace\\Setups\\chromedriver_win32\\chromedriver.exe");
				driver = new FirefoxDriver();	
			}

			else {
				System.setProperty("webdriver.ie.driver", "F:\\Selenium_Workspace\\Setups\\chromedriver_win32\\chromedriver.exe");
				driver = new InternetExplorerDriver();	
			}

			driver.manage().window().maximize();
		}
		return driver;		
	}
	
}
