package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
 
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername,String url) {
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		return driver;
	}
	
	
}
