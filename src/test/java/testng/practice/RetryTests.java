package testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests extends IRetryAnalyzerImpl {

	private static int count = 0;

//	@Test(retryAnalyzer = IRetryAnalyzerImpl.class)
	public void fail() {
		assert 5 > 10 : "5 > 10? Did you go to school?";
	}

	/*
	 * It fails 4 times. Passes 5th time.
	 */
	@Test(retryAnalyzer = IRetryAnalyzerImpl.class)
	public void fail2() {
		int count = 0;
		if (count != 5) {
			System.out.println(" count: " + count);
			Assert.fail("FAIL");
			count++;
		}

		else
			System.out.println("I passed " + count);

	}
}
