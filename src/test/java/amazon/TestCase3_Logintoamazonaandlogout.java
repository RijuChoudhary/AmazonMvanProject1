package amazon;

import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TestCase3_Logintoamazonaandlogout extends BaseClass{
	@Test(retryAnalyzer = RetryLogic.class)
	public void logout() throws InterruptedException {
		
		
		
		Reporter.log("browser is lauched");
		Thread.sleep(3000);
		HomePage h1=new HomePage(driver);
		h1.hoveroveronAccountandList(driver);
		h1.signin();
	
		
		LoginPage l1=new LoginPage(driver);
		l1.entervalidusername();
		Reporter.log("username is entered");
		l1.clickcontinue();
		
		l1.entervalidpassword();
		Reporter.log("password is entered");
		
		l1.signclick();
		Reporter.log("login is successful");
		
		h1.searching();
		Reporter.log("product search is sucessful");
		h1.hoveroveronAccountandList(driver);
		h1.signingout();
		Reporter.log("signout is successful");
		
	}

}
