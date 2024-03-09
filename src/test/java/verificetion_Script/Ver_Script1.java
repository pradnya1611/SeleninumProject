package verificetion_Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ver_Script1 {
	@Test
	public void Test1() {
		String str1="PRADNYA";
		String str2="PRADnya";
		Assert.assertNotEquals(str1, str2);
	}
	@Test
	public void Test2() {
		Reporter.log("Test2 method is pass",true);
	}
	@Test
	public void Test3() {
		Reporter.log("Test3 method is pass",true);
	}

}
