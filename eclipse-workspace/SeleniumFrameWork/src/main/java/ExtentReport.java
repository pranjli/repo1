import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("Extentreport.html");
ExtentReports extent1 = new ExtentReports();
extent1.attachReporter(extent);


ExtentTest test1 = extent1.createTest("Google Search");
System.setProperty("webdriver.chrome.driver","D:/Users/Default User/Downloads/chromedriver.exe");
WebDriver driver = new ChromeDriver();

test1.log(Status.INFO,"starting TC");
driver.get("https://google.com");
test1.pass("navigated");

driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");

test1.pass("Enter text in searchbox");

driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
test1.pass("enter key");
test1.pass("details");

extent.flush(null);
	}

}
