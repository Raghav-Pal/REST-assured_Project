package utils2;

public class TestExcelUtils {

	public static void main(String[] args) {
		
		String excelPath = "./data/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtility excel = new ExcelUtility(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		
	}
}
