package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script3 {
	@Test(invocationCount=5)
	public void CreateAccount() {
		Reporter.log("Create acc method",true);
	}

}
