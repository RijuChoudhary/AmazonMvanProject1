package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_1 {
	
	WebDriver driver;
	//locating each element by FindBy
	@FindBy(name="email") 
	WebElement username;
	@FindBy(id="pass") 
	WebElement password;
	
	@FindBy(xpath="//button") 
	WebElement loginbutton;
	
	//create separate method for component to perform action
	public void username_validinput() {
		username.sendKeys("rijuchoudhary15@gmail.com");
		
	}
	
	public void password_validinput() {
		password.sendKeys("Sshanuu@21");
		
	}
	
	public void login_validinput() {
		loginbutton.click();
		
		
	}
	
	//create constructir
	public LoginPage_1(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

}
