package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.Loginpage1;
import util.BrowserFactory;

public class LoginTest1 {
	WebDriver driver;
	@Test
	public void usershouldnotbeabletoaddduplicatecategory() {
		
		driver=BrowserFactory.startbrowser("chrome"," http://techfios.com/test/101/");
		Loginpage1 lp1=PageFactory.initElements(driver,Loginpage1.class);
		
		lp1.insertcategory1("automation10");
		
		lp1.clickaddbuttonelement1();
		
		
}
}