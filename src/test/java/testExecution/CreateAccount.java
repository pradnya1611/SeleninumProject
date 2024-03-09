package testExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends Base_Script {
	@Test
	public void Create() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Pradnya");
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Kambale");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pradnyark@gmail.com");
	}

}
