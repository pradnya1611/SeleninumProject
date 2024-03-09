package test_Scripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		Login_Script_For_Actitime page=new Login_Script_For_Actitime(driver);
		page.setLogin("Admin@gmail.com", "Manger");
		page.clickLogin();

	}

}
