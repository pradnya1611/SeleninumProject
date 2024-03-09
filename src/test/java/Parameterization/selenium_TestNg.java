package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium_TestNg {
    @Test
	public void TestLogin() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//username
	driver.findElement(By.id("email")).sendKeys(email);
	//passwoard
	driver.findElement(By.id("pass")).sendKeys(pwd);
	
	}
}
