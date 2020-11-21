package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class TestNGMultiBrowserDemo {

	WebDriver driver=null;
	String projectPath = System.getProperty("user.dir");
      
	@org.testng.annotations.Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName) {
		System.out.println("Browser name is "+BrowserName);
if(BrowserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	driver=new ChromeDriver();
}
      }
	@Test
	public void test() {
		driver.get("https//google.com");
	

	}
	


}
