package progs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SingleRow {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File src = new File("D:/Resume/TestData.xls");
		FileInputStream fis = new FileInputStream(src);
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Test1");
		
		HSSFRichTextString data0 = sheet.getRow(0).getCell(0).getRichStringCellValue();
		System.out.println(data0);
	}

}
