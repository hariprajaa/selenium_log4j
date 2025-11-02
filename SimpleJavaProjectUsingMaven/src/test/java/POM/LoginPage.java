package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class LoginPage {
	WebDriver driver;
	//Constructor
	LoginPage(WebDriver driver){
		
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
	}
	//Locators 
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	//Action methods
	
	public void SetUserName(String name) {
		username.sendKeys(name,Keys.ENTER);
		
	}
	
	public void setUserPassword(String pass) {
		password.sendKeys(pass,Keys.ENTER);
	}
	
		
	
}
