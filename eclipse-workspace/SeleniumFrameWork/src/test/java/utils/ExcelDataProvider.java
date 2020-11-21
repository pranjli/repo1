package utils;

public class ExcelDataProvider {


	public static void main(String[] args) {
		String excelPath = "C:\\Users\\pranjlti\\eclipse-workspace\\SeleniumFrameWork\\excel\\data.xlsx.xlsx";
		String sheetName= "Sheet1";
		testdata(excelPath, sheetName);

	}
	public  static Object[][] testdata(String excelPath, String sheetName ) {
		Excelutils excel = new Excelutils(sheetName, sheetName);

		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();

		Object data[][] = new Object[rowcount-1][colcount];
				
		for(int i =1; i<rowcount; i++) {
			for(int j=0; j<colcount;j++) {
				
				double datanum = excel.getCellDataNumber(i, j);
				System.out.println(datanum+ " ");
				data[i-1][j]=datanum;
				
				System.out.println(datanum);
			}
		
		}
		return data;
		

	}
}


