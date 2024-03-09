package hashmap;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMap_Script {

	public static void main(String[] args) {
		HashMap<String, String> ref=new HashMap<>();
		//to add data in hasmap
		ref.put("URL", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref.put("Username", "Admin");
		ref.put("Password", "admin123");
		//open browser
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url=ref.get("URL");
		driver.get(url);
		//Enter username
		String un=ref.get("Username");
		driver.findElement(By.name("username")).sendKeys(un);
		//Enter password
		String pass=ref.get("Password");
		driver.findElement(By.name("password")).sendKeys(pass);
		//clic on login button
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
	}

}
