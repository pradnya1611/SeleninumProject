package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void Home_App() {
		Reporter.log("Home page of app is working fine",true);
	}
	@Test
	public void HomeVerify() {
		Reporter.log("Home page Verify",true);
	}
}
