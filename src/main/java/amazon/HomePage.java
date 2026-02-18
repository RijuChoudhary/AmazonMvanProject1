package amazon;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement signout;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement assertiontext;
	
	
	
	
	
	public void hoveroveronAccountandList(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	public void signin() {
		signin.click();
		
		
	}
	
	public void searching() {
		searchoption.sendKeys("shoes" + Keys.ENTER);
		
	}
	
	public void signingout() {
		signout.click();
		
	}
	
	public void assertion() {
        String value = assertiontext.getText();
        System.out.println(value);
        
    }

	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
