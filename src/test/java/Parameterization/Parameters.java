package Parameterization;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameters{
	@Test
	@org.testng.annotations.Parameters({"un","pwd"})
	public void signUp(String un ,String pwd) {
		Reporter.log(un, true);
		Reporter.log(pwd, true);
	}

}
