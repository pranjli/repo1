package mercurytour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

public class Mercurytours {

	public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/mercurysignon.php");	
	driver.manage().window().maximize();
	String path = "D:\\Users\\Default User\\Desktop\\Selenium\\Data.txt";
	BufferedReader reader = new BufferedReader(new FileReader(path));
	String row;
	while((row=reader.readLine())!=null) {
		String[] data = row.split(",");
		
		driver.findElement(By.name("userName")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		driver.findElement(By.name("login")).click();
	}
	
	
	
	
	

		
}}

