package progs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ApachePOI {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Resume\\TestData.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.getSheet("Test");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0;i<=rowCount;i++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();
            
            //iterate over each cell to print its value
            System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }

	}

}
