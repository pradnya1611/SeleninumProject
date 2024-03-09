package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class Test_Script1 {
	public void Test_Script01() {
		System.out.println("HII");
		Reporter.log("Test_Script01",true);
	}
	public void Test_Script02() {
		Reporter.log("Test_Script02",true);
	}

}
