package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectpath +"/excel/data.xlsx.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataNumber(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}
