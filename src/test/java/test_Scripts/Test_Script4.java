package test_Scripts;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script4 {
	@Test
	public void signup() {
		Reporter.log("Signup method is executed",true);
		//fail();
	}
	@Test(dependsOnMethods="signup")
	public void login() {
		Reporter.log("Login page method is executed",true);
	}

}
