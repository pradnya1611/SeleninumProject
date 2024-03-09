package verificetion_Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertnotEqual_script {
	@Test
	public void m1() {
		String str1="Pradnya";
		String str2="PRADnya";
		Assert.assertNotEquals(str1, str2);
		Reporter.log("Verification is pass",true);
	}

}
