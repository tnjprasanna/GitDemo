package progs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		/*
		WebDriver driver=null; 
		driver.get("http://www.example.com");
		
		driver.findElement(By.id("userName")).sendKeys("testUser1");
		driver.findElement(By.id("password")).sendKeys("passwd@123");
		
		String dispText = driver.findElement(By.id("dispText")).getText();
		if(dispText.equals("Welcome")) {
			System.out.println("Welcome Text Displayed");
		} else {
			System.out.println("not displayed");
		}
		
		driver.findElement(By.id("download")).click();
		*/
		FileInputStream fis = new FileInputStream("D:\\Resume\\TestData.xls");
		
		HSSFWorkbook workBook = new HSSFWorkbook(fis); 
		HSSFSheet sh = workBook.getSheetAt(0);

		//get row count 
		int rowCount = sh.getLastRowNum();
		int colCount = 0;
			
		for(int i =0;i<=rowCount;i++) {
			
			colCount = sh.getRow(i).getLastCellNum();
			//System.out.println(cellCount);
			for(int j=0;j<colCount;j++)
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
				if(colCount==3) {
					System.out.println(" ");
				}
		}
		
		String input="g";
		Object [][] data = {{input}};
		
		for (Object[] id : data) {
			Row row = sh.createRow(++rowCount);
			Cell cell = row.createCell(colCount);
			cell.setCellValue(rowCount);
			
			for(Object field : id) {
				if(field instanceof String) {
					cell.setCellValue((String)field);
					System.out.println("set cell value =============" + field);
				}
			}
		}
		
		fis.close();
		FileOutputStream fos = new FileOutputStream("D:\\\\Resume\\\\TestData.xls");
		workBook.write(fos);
		fos.close();
		workBook.close();
		
	}

}
