package com.excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXL {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\ExcelPOI\\Test.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Sheet0");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i< rowCount;i++) {
			
			HSSFRow row = sheet.getRow(i);
			
			int colCount = row.getPhysicalNumberOfCells();
			for(int j=0;j<colCount;j++) {
				HSSFCell cell = row.getCell(j);
				String cellValue = getCellValue(cell);
				System.out.print("||"+cellValue);
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}
	
	public static String getCellValue(HSSFCell cell) {
		
		switch (cell.getCellType()) {
			case NUMERIC: return String.valueOf(cell.getNumericCellValue());
			case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
			case STRING: return cell.getStringCellValue();
			default : return cell.getStringCellValue();
		}

	}

}
