

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void test() {
		System.setProperty("wrbdriver.chrome.driver", "C:\\Users\\pranjlti\\eclipse-workspace\\seleniumtestng\\src\\main\\resources\\diver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
	
	
	
	
	
	
	}
				}
