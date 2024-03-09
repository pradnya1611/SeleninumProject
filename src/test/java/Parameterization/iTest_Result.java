package Parameterization;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class iTest_Result extends Assert {
	@Test
	public void testCasefail() {
		fail();
		//assertTrue(true);	
	}
	@Test
	public void testCasePass() {
		assertTrue(true);
	}
	@AfterMethod
	public void GetStatus(ITestResult result) {
		if (result.getStatus()== ITestResult.SUCCESS) {
			Reporter.log("succes =method status :" +result.getStatus(),true);
			Reporter.log("method name :" +result.getName(),true);
		}
		if (result.getStatus()== ITestResult.FAILURE) {
			Reporter.log("succes =method status :" +result.getStatus(),true);
			Reporter.log("method name :" +result.getName(),true);
	
		}
	}
}
	


