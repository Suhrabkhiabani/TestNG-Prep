package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String pathToExcelfile = ".\\src\\test\\resources\\inputData\\DataFile.xlsx";

	public static Workbook book;
	public static Sheet sheet;

	public static Object[][] getExcelData(String sheetName) {

		try {
			FileInputStream file = new FileInputStream(pathToExcelfile);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);

			// This line of code will read all values in excel till last row and last column
			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				}

			}

			return data;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}


}
