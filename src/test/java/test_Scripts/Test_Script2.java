package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script2 {
	@Test(priority =5)
	public void CreateAcc() {
		Reporter.log("Create account mecthod executed", true);	
		}
	@Test(priority =3)
	public void updateAcc() {
		Reporter.log("Update account mecthod executed", true);	
		}
	@Test(priority =4)
	public void deleteAcc() {
		Reporter.log("Delete account mecthod executed", true);	
		}
	@Test(priority =2)
	public void readAcc() {
		Reporter.log("Read account mecthod executed", true);	
		}
	@Test(priority =1)
	public void editAcc() {
		Reporter.log("Edit account mecthod executed", true);	
		}
	
}




