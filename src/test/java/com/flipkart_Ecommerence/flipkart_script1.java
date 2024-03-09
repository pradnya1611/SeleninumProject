package com.flipkart_Ecommerence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkart_script1 {
	private WebElement searchElement;
	private WebElement mobile1;
	private WebElement ramMob;
	private WebElement clickMobile;
	private WebElement addcart;
	
	public flipkart_script1(WebDriver driver) {
		searchElement=driver.findElement(By.xpath(".//input[@name='q']"));
		mobile1=driver.findElement(By.linkText("Mobiles"));
		ramMob=driver.findElement(By.xpath(".//div[text()='8 GB and Above']"));
		clickMobile=driver.findElement(By.xpath(".//div[text()='OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 256 GB)']"));
		addcart=driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		
	}
	public void SearchMob(String name) {
		searchElement.sendKeys(name);
		searchElement.click();
	}
	public void mob() {
		mobile1.click();
	}
	public void ram() {
		ramMob.click();
	}
	public void clickonmob() {
		clickMobile.submit();
	}
	public void clickAddcart() {
		addcart.click();
	}
	

}
