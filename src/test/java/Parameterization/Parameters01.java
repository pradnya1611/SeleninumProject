package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Parameters01 {
	@org.testng.annotations.Parameters({"email","pwd"})
	@Test
	public void login(String email, String pwd) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//username
		driver.findElement(By.id("email")).sendKeys(email);
		//passwoard
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		
	}

}
