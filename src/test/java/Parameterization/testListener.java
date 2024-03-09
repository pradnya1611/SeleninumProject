package Parameterization;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;
@Listeners(ListenerClass.class)
public class testListener {
	@Test
	public void Login() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//to login
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin123");
		driver.findElement(By.xpath(".//button[text()='login']")).submit();
		Assert.assertEquals(driver.getTitle(),"facebook_login or singup");
	}
	@Test
	public void TestFail() {
		Reporter.log("Failed Test Case",true);
		Assert.assertTrue(false);
	}
	@Test
	public void TestSkipped() {
		Reporter.log("Skipped Test case",true);
		//exception thrown using throw new
		throw new SkipException("Skip execution throw...");
	}

}
