package tesrScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Signup_Page {
	private WebElement firstname;
	private WebElement lastname;
	private WebElement mobilenumber;
	private WebElement password;
	private WebElement date;
	private WebElement month;
	private WebElement year;
	private WebElement femaleoption;
	private WebElement maleoption;
	private WebElement customoption;
	private WebElement signup;
	
	public FaceBook_Signup_Page(WebDriver driver) {
		firstname=driver.findElement(By.name("firstname"));
		lastname=driver.findElement(By.name("lastname"));
		mobilenumber=driver.findElement(By.name("reg_email__"));
		password=driver.findElement(By.id("day"));
		date=driver.findElement(By.id("password_step_input"));
		month=driver.findElement(By.id("month"));
		year=driver.findElement(By.id("year"));
		femaleoption=driver.findElement(By.xpath(".//input[@value='1']"));
	    maleoption=driver.findElement(By.xpath(".//input[@value='2']"));
	    customoption=driver.findElement(By.xpath(".//input[@value='-1']"));
	    signup=driver.findElement(By.name("websubmit"));
	}
	public void setName(String F_name, String L_name) {
		firstname.sendKeys(F_name);
		lastname.sendKeys(L_name);
	}
	public void setMobileNumber(String number) {
		mobilenumber.sendKeys(number);
		
	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void selectDOB(String day, String monthindex, String yearindex) {
		Select s=new Select(date);
		s.selectByVisibleText(day);
		Select s1=new Select(month);
		s1.selectByVisibleText(monthindex);
		Select s2=new Select(year);
		s1.selectByVisibleText(yearindex);
		
	}
	public void Femaleoption() {
		femaleoption.click();
	}
	public void maleoption() {
		maleoption.click();
	}
	public void SignupButton() {
		signup.click();
	}

}
