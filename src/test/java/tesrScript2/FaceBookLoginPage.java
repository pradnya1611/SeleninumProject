package tesrScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginPage {
	private WebElement emailfiled;
	private WebElement passwordfiled;
	private WebElement forgotfiled;
	private WebElement loginbutton;
	private WebElement createnewAccount;
   
	public FaceBookLoginPage(WebDriver driver) {
		emailfiled=driver.findElement(By.id("email"));
		passwordfiled=driver.findElement(By.name("pass"));
		forgotfiled=driver.findElement(By.linkText("Forgotten password?"));
		loginbutton=driver.findElement(By.name("login"));
		createnewAccount=driver.findElement(By.linkText("Create new account"));
	}
	
	public void setLogin(String user, String pwd) {
		emailfiled.sendKeys(user);
		passwordfiled.sendKeys(pwd);
	}
	public void clickonLoginButton() {
		loginbutton.click();
	}
	public void clickonforgotpassword() {
		forgotfiled.click();
	}
	public void clickonCreateAccount() {
		createnewAccount.click();
	}
	

}
