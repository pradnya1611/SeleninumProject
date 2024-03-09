package excelSheet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mainapp_Script_For_Utility {
	@Test
	public void Login() throws IOException {
		WebDriver driver=new FirefoxDriver();
		utilityMethod un=new utilityMethod();
		driver.get(un.getDataFromExcel("sheet1", 0, 0));
		
	}

}
