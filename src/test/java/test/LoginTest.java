package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	@Test
	public void usershouldbeabletoaddcategory() {
		
		driver=BrowserFactory.startbrowser("chrome"," http://techfios.com/test/101/");
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		
		lp.insertcategory("automation1");
		
		lp.clickaddelement();
		//System.out.println("Category:"+)
		lp.monthdropdown();
		
	//	driver.close();
		//driver.quit();
	}

}
