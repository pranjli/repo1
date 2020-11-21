package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Source {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void launchBrowser() {
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	}
@Test
public void formsearch() {
	driver.get("http://sfwebhtml:sourcefuse.com/automation-form-demo-for-interview/");
	
}
	
	
	
	
	
	
	
	
	
}
