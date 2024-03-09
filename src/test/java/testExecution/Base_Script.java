package testExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Script {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void OpenBrowser(String browser) {
		if(browser.equals("Firefox")) {
			driver=new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void OpenApp() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void testmethodExecution(ITestResult result) {
		String methodname=result.getName();
		if(result.getStatus()==1) {
			Reporter.log(methodname+"exection is pass",true);
		}else {
			Reporter.log(methodname+"Execution is fail",true);
		}
	}
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

}
