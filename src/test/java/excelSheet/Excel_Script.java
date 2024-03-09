package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Script {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN/Sample.xlsx";
		//cpoy rom to ram 
		FileInputStream file=new FileInputStream(path);
		//open Excel
		Workbook wb=WorkbookFactory.create(file);
		//open sheet 
		Sheet sh = wb.getSheet("sheet1");
		//identify row 
		Row r = sh.getRow(1);
		//identify cell
		Cell c = r.getCell(0);
		//identify cell data
		double data = c.getNumericCellValue();
		//String data = c.getStringCellValue();
		System.out.println(data);
		

	}

}
