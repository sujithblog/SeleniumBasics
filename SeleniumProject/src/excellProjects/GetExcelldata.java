package excellProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class GetExcelldata {

	public static String getExcelData(String sheetName, int rowNum, int cellNum) {
		String retVal=null;
		try {
				FileInputStream fis=new FileInputStream("/home/skombettu/All/batch155javaprogram/data.xlsx");
				Workbook wb=WorkbookFactory.create(fis);
				Sheet s= wb.getSheet(sheetName);
				Row r=s.getRow(rowNum);
				Cell c=r.getCell(cellNum);
				retVal=	c.getStringCellValue();
			} 	
			catch (FileNotFoundException e) {
 			e.printStackTrace();
			} catch (EncryptedDocumentException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		return retVal;
	}
	
	public static WebDriver driver=new FirefoxDriver();
	
	public static void openURL() {
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		}
	
	public static void login() {
		String un=GetExcelldata.getExcelData("Sheet1", 1, 0);
		String pwd=GetExcelldata.getExcelData("Sheet1", 1, 1);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
}
