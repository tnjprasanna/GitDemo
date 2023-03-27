package com.excel.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Prasanna");
		sheet.getRow(0).createCell(1).setCellValue("Venkatesan");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Welcome");
		sheet.getRow(1).createCell(1).setCellValue("World");
		
		File file = new File("D:\\ExcelPOI\\Test.xls");
		workbook.write(file);
		workbook.close();
	}

}
