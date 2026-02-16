package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener{
	
	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destinatiobn=new File("C:\\Users\\rijuc\\eclipse-workspace\\AmazonProject01\\screenshots\\Pass\\TestCase"+Math.random()+".png");
		try {
			FileHandler.copy(source, destinatiobn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destinatiobn=new File("C:\\Users\\rijuc\\eclipse-workspace\\AmazonProject01\\screenshots\\Fail\\TestCase"+Math.random()+".png");
		try {
			FileHandler.copy(source, destinatiobn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
