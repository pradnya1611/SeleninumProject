package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericCode {
	static Workbook book;
	static int row;
	static int cell;
	public static Workbook getWorkbookData() throws IOException {
		try {
			FileInputStream file=new FileInputStream("../MAVEN/DemoWebShop.xlsx");
			book=WorkbookFactory.create(file);
		}catch(EncryptedDocumentException e){
			
		}catch(FileNotFoundException e) {
			
		}
		return book;
	}
	public static int getrow() {
		return row=book.getSheet("Sheet2").getLastRowNum();
	}
	public static int getcell() {
		return cell=book.getSheet("sheet2").getRow(0).getLastCellNum();
	}

}
