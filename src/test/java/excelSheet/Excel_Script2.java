package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Script2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="../MAVEN/Sample.xlsx";
		FileInputStream file=new FileInputStream(path);
		//open excel
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet2");
		for(int rownum=0;rownum<=1;rownum++) {
			Row r = sh.getRow(rownum);
			for(int cellnum=0;cellnum<=1;cellnum++) {
				Cell c = r.getCell(cellnum);
				System.out.println(c.toString()+" ");
			}
			System.out.println(" ");
		}
		
	}

}
