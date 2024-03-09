package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class For_Script {
	private WebElement forgotten_Pass;
	
	public void For_Script(WebDriver driver) {
		forgotten_Pass=driver.findElement(By.xpath(".//a[text()='Forgotten password?']"));
	}
	public void clickForgotPass() {
		forgotten_Pass.click();
	}

}
