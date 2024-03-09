package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class data_Provider_Script {
	@org.testng.annotations.DataProvider
	public Object[][] testData(){
		Object[][] obj=new Object[1][2];
		obj[0][0]="Admin@123";
		obj[0][1]="Admin!123";
		return obj;
	}
	@Test(dataProvider="testData")
	public void testlogin(String email,String pwd) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter username
		driver.findElement(By.id("email")).sendKeys(email);
		//Enter password
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
}
