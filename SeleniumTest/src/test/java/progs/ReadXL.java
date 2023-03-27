package progs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class ReadXL {

public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("D:\\Resume\\TestData.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Test");
		
		Iterator<Row> rowIterator = sheet.rowIterator();
		
		while(rowIterator.hasNext()) {
			
			Row row = rowIterator.next();
			//For each row all columns
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				//check the cell type and format accordingly 
				if(cell.getCellType() == CellType.STRING) {
					System.out.println(cell.getStringCellValue());
				}
				else if(cell.getCellType() == CellType.NUMERIC) {
					System.out.println(cell.getNumericCellValue());
				}
			}
			System.out.println("");
		}
		
	}

}
