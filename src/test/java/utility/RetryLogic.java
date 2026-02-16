package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {

	int count=0;
	int maxcount=2;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxcount) {
			count++;
			return true;
		}
		return false;
	}

}
