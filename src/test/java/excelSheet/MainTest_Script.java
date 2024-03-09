package excelSheet;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest_Script {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMapCode.test();
		HashMap<String, String> data=HashMapCode.hashmapdata;
		System.out.println(data);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if(data.get("Gender").equals("Gender-female"))
			driver.findElement(By.id("gender-female")).click();
		else
			driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data.get("fname"));
		driver.findElement(By.id("LastName")).sendKeys(data.get("lname"));
		driver.findElement(By.id("Email")).sendKeys(data.get("emailID"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath(".//input[@name='Password']")).sendKeys(data.get("password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("password"));
		
	}

}
