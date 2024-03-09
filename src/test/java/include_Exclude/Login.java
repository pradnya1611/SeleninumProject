package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void LoginApp() {
		Reporter.log("Login page of app is working fine",true);
	}
	@Test
	public void LoginVerify() {
		Reporter.log("LoginApp process is verify",true);
	}

}
