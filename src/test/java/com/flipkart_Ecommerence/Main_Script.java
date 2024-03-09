package com.flipkart_Ecommerence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		flipkart_script1 p=new flipkart_script1(driver);
		p.SearchMob("one plus");
			
		

	}

}
