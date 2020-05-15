package util;

public class TestExcelUtils {
	
	public static void main(String[] args) {
		
		String excelPath = "data/TestDataCopy.xls";
		String sheetName = "Sheet1";
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1, 0);
		excel.getCellData(1, 1);
		excel.getCellData(1, 2);
		
	}

}
