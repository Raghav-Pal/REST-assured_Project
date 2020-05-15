package util;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			InputStream file = new FileInputStream(excelPath);
			workbook = new HSSFWorkbook(new POIFSFileSystem(file));
			//workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void getRowCount() {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
	}

	public static void getCellData(int rowNum, int colNum) {
		
			DataFormatter formatter = new DataFormatter();
			Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(value);

	}

}
