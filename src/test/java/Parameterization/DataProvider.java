package Parameterization;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider {
	@Test
	@org.testng.annotations.DataProvider
	public Object[][] data(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Admin1";
		obj[0][1]="manager1";
		obj[1][0]="Admin2";
		obj[1][1]="Manage2";
		return obj;
			
	}
	@Test(dataProvider="data")
	public void Signup(String un, String pwd) {
		Reporter.log(un,true);
		Reporter.log(pwd,true);
	}

}
