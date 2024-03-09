package Parameterization;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;

public class ListenerClass implements ITestListener {
	public void Onstart(ITestContext result) {
		Reporter.log("on start method invoke...",true);
	}
	public void OnFinish(ITestContext result) {
		Reporter.log("on finish method invoke...",true);
	}
	public void OnTestFailture(ITestContext result) {
		Reporter.log("Name of test method failed:"+result.getName(),true);
	}
	public void OnTestSuccess(ITestContext result) {
		Reporter.log("Name of test method Success:"+result.getName(),true);
	}
	public void OnTestFailedButwithSuccessPercentage(ITestContext result) {
		
	}



}
