package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssertion {
	
	WebDriver driver = null;
	String path = System.getProperty("user.dir");
	
	SoftAssert softassert1= new SoftAssert();
	SoftAssert softassert2= new SoftAssert();
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
 @Test
 public void verifytitle() {
	 driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
	 String Actualtitle = driver.getTitle();
	 System.out.println("Actualtitle :" +Actualtitle);
	 String ExpectedTitle = "SourceFuse - Form Template";
	 softassert1.assertEquals(Actualtitle, ExpectedTitle);
	System.out.println("Assertion1 executed");
	softassert1.assertAll();
 }
	@Test
	public void verifyElement() {
		WebElement logo = driver.findElement(By.xpath("/html/body/div/div/img"));
		softassert2.assertEquals(true, logo.isDisplayed());
		softassert2.assertAll();
		System.out.println("Icon is displayed");
		System.out.println("Assertion 2 is executed");
			}
 
	@AfterTest
	public void closedriver(){
	driver.close();
	
	}
	     
	
}
