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

public class Excel_Script5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN/Sample.xlsx";
		FileInputStream file=new FileInputStream(path);
		//open Excel
		Workbook wb=WorkbookFactory.create(file);
		//open sheet
		Sheet sh = wb.getSheet("sheet2");
		//remove row
		Row tgt = sh.getRow(0);
		sh.removeRow(tgt);
		//remove cell
		Row r = sh.getRow(1);
		Cell tgt_cell = r.getCell(0);
		r.removeCell(tgt_cell);
		FileOutputStream out=new FileOutputStream(path);
		wb.write(out);

	}

}
