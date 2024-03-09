package excelSheet;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_Script6 {
	@Test
		@DataProvider
		public String [][] login(){
			String [][]data=null;
			try {
				FileInputStream file=new FileInputStream("..=/MAVEN/DemoWebShop.xlsx");
				Workbook wb=WorkbookFactory.create(file);
				int rows=wb.getSheet("sheet1").getLastRowNum();
				int cell=wb.getSheet("sheet1").getRow(0).getLastCellNum();
				data=new String[rows][cell];
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cell;j++) {
						data[i][j]=wb.getSheet("sheet1").getRow(i).getCell(j).toString();
					}
					
				}
			}catch(Exception e) {
				
			}
			return data;
		}
			@Test(dataProvider ="login")
			public void data(String[]m){
				WebDriver driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.name("Gender")).click();
				driver.findElement(By.id("FirstName")).sendKeys(m[1]);
				driver.findElement(By.id("LastName")).sendKeys(m[2]);
				driver.findElement(By.id("Email")).sendKeys(m[3]);
				driver.findElement(By.name("Password")).sendKeys(m[4]);
				driver.findElement(By.name("ConfirmPassword")).sendKeys(m[4]);
				driver.findElement(By.name("register-button")).click();
			}
		
	}


