package selenium.busDashboard;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class read_excel_data {

	public String[][] read_sheet() throws InvalidFormatException, IOException{
		File myFile = new File(".\\resources\\inputData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(myFile);
		XSSFSheet mysheet = wb.getSheet("sheet1");
		int numberOfRows = mysheet.getPhysicalNumberOfRows();
		int numberOfColumns = mysheet.getRow(0).getLastCellNum();
		String[][] myArray = new String[numberOfRows-1][numberOfColumns];
		
		for (int i =1 ; i<numberOfRows ;i ++) {
			for (int a =1 ; a<numberOfColumns ;a ++) {
				XSSFRow row = mysheet.getRow(i);
				myArray[i-1][a] = row .getCell(a).getStringCellValue();
			}
		}
		return myArray;
	}
}
