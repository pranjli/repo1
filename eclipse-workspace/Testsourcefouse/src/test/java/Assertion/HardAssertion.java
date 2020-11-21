package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertion {
	WebDriver driver=null;
	String path = System.getProperty("user.dir");

	@BeforeTest
	public void SetDriver() {
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void verifyTitle() {
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "SourceFuse - Form Template";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Assert Passed");
	}

	@AfterTest
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
}
