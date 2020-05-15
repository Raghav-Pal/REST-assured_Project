package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}
	}


	public static void getRowCount() {

		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows : "+rows);
	}

	public static void getCellData(int rowNum, int colNum) {
		try {

			DataFormatter formatter = new DataFormatter();
			Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println("Fomatted value : "+value);

			//double cellData = sheet.getRow(1).getCell(2).getNumericCellValue();
			//String cellData = sheet.getRow(1).getCell(2).getNumericCellValue();
			//System.out.println(Integer.parseInt(cellData));

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}
	}

}
