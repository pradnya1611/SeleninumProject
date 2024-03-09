package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogOut {
	@Test
	public void Logout() {
		Reporter.log("Logout link is working fine",true);
	}
	@Test
	public void VerifyLogout() {
		Reporter.log("Logout success",true);
	}

}
