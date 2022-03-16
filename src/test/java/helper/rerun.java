package helper;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class rerun implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 1; // should only have to retry if data is not correct or the UI responds
												// slower than expected

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
