package tesrScript2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Main_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FaceBookLoginPage page=new FaceBookLoginPage(driver);
		page.setLogin("admin@1234", "Manager");
		page.clickonLoginButton();
		page.clickonCreateAccount();

	}
	public class TestAccount{
		@Test
		public void TestLogin() {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			FaceBookLoginPage page=new FaceBookLoginPage(driver);
			page.clickonCreateAccount();
			FaceBook_Signup_Page page1=new FaceBook_Signup_Page(driver);
			page1.setName("Admin", "Manage");
			page1.setMobileNumber("Admin@123gmail.com");
			page1.setpassword("Manager12");
			page1.selectDOB("7", "Oct", "1997");
		}
	}

}
