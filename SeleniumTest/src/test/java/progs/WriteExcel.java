package progs;

import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;


public class WriteExcel {
	
	public void WriteToXL(String sheetName,String valueToWrite) throws IOException{
		
		File file = new File("D:\\Resume\\TestData.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Test");
		
		//Get the current count of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    
	    Row row = sheet.getRow(0);
	    Row newRow = sheet.createRow(rowCount);
	    
	    for(int j=0; j<row.getLastCellNum();j++) {
	    	Cell cell = newRow.createCell(j);
	    	cell.setCellValue(valueToWrite);
	    }
	    fis.close();
	    
	    FileOutputStream fos = new FileOutputStream(file);
	    workbook.write(fos);
	    fos.close();
		
	}
	
	public static void main(String args[]) throws IOException {
		
		String valueToWrite = ("Mr. E");
		
		WriteExcel objExcelFile = new  WriteExcel();
		objExcelFile.WriteToXL("Test2",valueToWrite);
	}
	
	
}



