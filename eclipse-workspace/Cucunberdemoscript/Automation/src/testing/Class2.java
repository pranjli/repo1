package testing;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class2 {
	WebDriver driver=null;
	
	public static void main(String args[]) throws IOException {

//		ArrayList arr = new ArrayList();
//		arr.add(1);
//		arr.add("A");
//		
//		for(Object str : arr) {
//			System.out.println(str);
//		}
////		arr.add("A");
////		arr.add("B");
////		arr.add("C");
//////		for(String str : arr)
//////			System.out.println(str);
////
////		arr.add("D");
////		for(String str : arr) {
////		System.out.println(str);
////		}
////		arr.remove(1);
			
		System.setProperty("webdriver.chrome.driver", "C:/Users/pranjlti/eclipse-workspace/Automation/src/driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)  driver;
		driver.get("https://tus.io/demo.html");
		js.executeScript("window.scrollBy(0,1000)");
		WebElement browser = driver.findElement(By.id("js-file-input"));
		browser.click();
		Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\Uploadfile.exe");
	
}
}
