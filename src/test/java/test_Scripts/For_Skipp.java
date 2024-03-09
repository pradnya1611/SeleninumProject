package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class For_Skipp {
	@Test
	public void CreateAcc() {
		Reporter.log("Create account method is executed",true);
	}
	@Test(enabled=false)
	public void DeleteAcc() {
		Reporter.log("Delete account method is executed",true);
	}
	@Test
	public void UpdateAcc() {
		Reporter.log("Create account method is executed",true);
	}

}
