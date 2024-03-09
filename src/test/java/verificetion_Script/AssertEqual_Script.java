package verificetion_Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual_Script {
	@Test
	public void m1() {
		String str1="Pradnya";
		String str2="Pradnya";
		Assert.assertEquals(str1,str2);
		Reporter.log("Verification is pass",true);
	}

}
