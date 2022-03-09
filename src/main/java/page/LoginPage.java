package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
@FindBy(how=How.XPATH,using="/html/body/div[4]/input[1]")WebElement ADD_CATEGORYELEMENT;
@FindBy(how=How.XPATH,using="/html/body/div[4]/input[2]")WebElement CLICKADD_BUTTON_ELEMENT;
//@FindBy(how=How.XPATH,using="/")WebElement MONTHDROPDOWN_ELEMENT;
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]")WebElement MONTHDROPDOWN_ELEMENT;

public void insertcategory(String Category) {
	
	Random rnd=new Random();
	int generatedNumber=rnd.nextInt(999);
	
	
		
	ADD_CATEGORYELEMENT.sendKeys(Category+generatedNumber);
	
}
public void clickaddelement() {
	CLICKADD_BUTTON_ELEMENT.click();
}

public void monthdropdown() {



Select select=new Select(MONTHDROPDOWN_ELEMENT);
List<WebElement>options=select.getOptions();
ArrayList<String>months=new ArrayList<>();{
for(WebElement we:options)
	months.add(we.getText());
System.out.println("current list of months:"+ months);
	
}
}
}
