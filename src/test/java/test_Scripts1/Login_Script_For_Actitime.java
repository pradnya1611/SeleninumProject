package test_Scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Script_For_Actitime {
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	//
	public Login_Script_For_Actitime(WebDriver driver) {
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));
		
	}
	public void setLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}

}
