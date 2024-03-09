package test_Scripts;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mutil_LevelScript {
	@Test
	public void test01() {
		Reporter.log("Test01 executed",true);
		//fail();
	}
	@Test(dependsOnMethods ="test01")
	public void test02() {
		Reporter.log("Test02 executed",true);
		//fail();
	}
	@Test(dependsOnMethods ="test02")
	public void test03() {
		Reporter.log("Test03 executed",true);
	}

}
