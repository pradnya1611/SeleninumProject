package excelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Script4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN/Empty.xlsx";
		FileInputStream file=new FileInputStream(path);
		//open Excel;
		Workbook wb=WorkbookFactory.create(file);
		//Create Sheet
		Sheet sh = wb.createSheet("SampleSheet");
		//create second row
		Row r = sh.createRow(1);
		//create cell
		Cell c = r.createCell(0);
		//add data
		c.setCellValue("Pradnya");
		//save change
		FileOutputStream out=new FileOutputStream(path);
		wb.write(out);

	}

}
