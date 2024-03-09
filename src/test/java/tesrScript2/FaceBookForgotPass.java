package tesrScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookForgotPass {
	private WebElement emailfiled;
	private WebElement cancelbutton;
	private WebElement serachfiled;
	
	public FaceBookForgotPass(WebDriver driver) {
		 emailfiled=driver.findElement(By.id("identify_email"));
		 serachfiled=driver.findElement(By.name("did_submit"));
		 cancelbutton=driver.findElement(By.linkText("Cancel"));
	}
	public void setEmail(String email) {
		emailfiled.sendKeys(email);
	}
	public void clickonserachButton() {
		serachfiled.click();
	}
	public void clickonCAncelButton() {
		cancelbutton.click();
	}
	

}
