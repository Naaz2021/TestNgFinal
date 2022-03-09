package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage1 {

		WebDriver driver;
		
		public Loginpage1(WebDriver driver) {
			this.driver=driver;
		}
	@FindBy(how=How.XPATH,using="/html/body/div[4]/input[1]")WebElement ADD_CATEGORYELEMENT;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/input[2]")WebElement CLICKADD_BUTTON_ELEMENT;

	public void insertcategory1(String Category) {
    ADD_CATEGORYELEMENT.sendKeys(Category);
    
		
	}
	public void clickaddbuttonelement1() {
		CLICKADD_BUTTON_ELEMENT.click();
		
	}
}