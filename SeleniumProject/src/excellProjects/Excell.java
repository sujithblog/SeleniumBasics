package excellProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("/home/skombettu/All/batch155javaprogram/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet("Sheet1");
			Row r=s.getRow(1);
			Cell c=r.getCell(0);
			String result=	c.getStringCellValue();
			System.out.println(result);
		} 	
		catch (FileNotFoundException e) {
 			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
