package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.ListenersLogic;

public class BaseClass extends ListenersLogic {
	
	
	@Parameters("browsername")
	
	@BeforeMethod
	public void browserlaunch(String whichBrowser) throws InterruptedException {
		if(whichBrowser.equals("chrome")) {
			driver=new ChromeDriver();
			
			
			
		}
        if(whichBrowser.equals("edge")) {
        	driver=new EdgeDriver();
			
			
		}
       if(whichBrowser.equals("firefox")) {
    	   driver=new FirefoxDriver();
			
			
		}
       driver.get("https://www.amazon.in/");
       Thread.sleep(3000);
    driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
       
       
		
	}
	
	@AfterMethod
	public void browserquit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
