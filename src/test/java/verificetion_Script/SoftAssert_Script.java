package verificetion_Script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Script {
	@Test
	public void Test01() {
		SoftAssert s=new SoftAssert();
		Reporter.log("Test01 method is execution is started",true);
		String str1="Pradnya";
		String str2="Pradnya";
		Reporter.log("Verification01 started",true);
		s.assertEquals(str1, str2);
		Reporter.log("Verification02 started",true);
		String str3="pradnya";
		s.assertEquals(str1, str3);
		Reporter.log("Test01 method is execution is end", true);
		s.assertAll();
	}
	@Test
	public void Test02() {
		Reporter.log("Test02 method executed",true);
	}

}
