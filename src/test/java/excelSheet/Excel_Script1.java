package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.CellType;

public class Excel_Script1 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// TODO Auto-generated method stub
		String path="../MAVEN/Sample.xlsx";
		//copy from rom to ram 
		FileInputStream file=new FileInputStream(path);
		//open excel
		Workbook wb=WorkbookFactory.create(file);
		//open sheet
		Sheet sh = wb.getSheet("Sheet1");
		//identify row 
		Row r = sh.getRow(1);
		//identify cell
		Cell c = r.getCell(0);
		//identify type of cell data
		CellType datatype= c.getCellType();
		if( datatype==CellType.STRING) {
			String data=c.getStringCellValue();
			System.out.println(data);
		}else {
			double data1=c.getNumericCellValue();
			System.out.println(data1);
		}
		//total row used in sheet 
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		//total cell used in row 
		short cellcount = sh.getRow(0).getLastCellNum();
		System.out.println(cellcount);

	}

}
