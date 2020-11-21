package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFSheet sheet;
	static XSSFWorkbook workbook;
	
	public Excelutils(String excelpath, String sheetname) {
		try {
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetname) ;
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
		public static void main(String[] args) {
//		getRowCount();
		getColCount();
		getCellDataNumber(1,1);
	}
	public static int getRowCount() {
		int rowcount=0;
		try{
			
			 rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("number of row count is :"+ rowcount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowcount;
	}

	public static int getColCount() {
		int celldata=0;
		try{
			 celldata = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(celldata);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return celldata;
	}
		public static double getCellDataNumber(int rowNumber, int colNumber) {
			double celldata=0;
			try{
				
				celldata = sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue();
				System.out.println(celldata);
			}
			catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return celldata;
	}
}


