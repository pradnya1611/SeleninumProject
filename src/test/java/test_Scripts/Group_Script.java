package test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Script {
	@Test(groups="Sample")
	public void m1() {
		Reporter.log("m1 method is executed",true);
	}
	@Test(groups="Sample")
	public void m2() {
		Reporter.log("m2 method is executed",true);
	}
	@Test(groups="Sample")
	public void m3() {
		Reporter.log("m3 method is executed",true);
	}
	@Test(groups="Sample")
	public void m4() {
		Reporter.log("m4 method is executed",true);
	}
	@Test(dependsOnGroups ="Sample")
	public void m5() {
		Reporter.log("m5 method is executed",true);
	}

}
