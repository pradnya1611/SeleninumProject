package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationTimeOut=2000)
	public void signup1()  {
		
		Reporter.log("Signup1 method is exeuted",true);
	}

}
