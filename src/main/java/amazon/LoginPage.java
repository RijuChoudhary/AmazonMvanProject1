package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement SigninButton;
	
	public void entervalidusername() {
		username.sendKeys("rijuchoudhary15@gmail.com");
	}
	
	public void clickcontinue() {
		continuebutton.click();
	}
	
	public void entervalidpassword() {
		Password.sendKeys("Sshanuu@21");
	}
	
	public void signclick() {
		SigninButton.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	

}
