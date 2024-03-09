package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Script3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN/Empty.xlsx";
		FileInputStream file=new FileInputStream(path);
		//open excel
		Workbook wb=WorkbookFactory.create(file);
		//open sheet 
		Sheet sh = wb.getSheet("Sheet1");
		int tr = sh.getLastRowNum();
		//identify each row
		for(int rownum=0; rownum<=tr;rownum++) {
		Row r = sh.getRow(rownum);
		short tc = r.getLastCellNum();
		//identify each cell
		 for(int cellnum=0;cellnum<=tc;cellnum++) {
				try {
					Cell c = r.getCell(cellnum);
				System.out.println(c.toString()+" ");
				}catch(NullPointerException e) {
					System.out.println("abc");
					
				}
			}
		}
		
		
	}
			
		
		
}


