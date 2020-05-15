package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		
		String excelPath = "./data/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		excel.getRowCount();
		excel.getCellData(1, 1);
	}

}
