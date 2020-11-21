import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sourcefuse {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
				
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Pranjli");
			driver.findElement(By.xpath("//*[@id='lnameInput']/input")).sendKeys("Tiwari");
			driver.findElement(By.xpath("//*[@type='email']")).sendKeys("tiwari.pranjli@gmail.com");
			driver.findElement(By.xpath("//*[@id='curCompanyInput']/input")).sendKeys("Capgemini");
			driver.findElement(By.xpath("//*[@id='mobInput']/input")).sendKeys("7066540633");
			
			WebElement DOB = driver.findElement(By.xpath("//*[@class='input-group date']/input"));
			DOB.sendKeys("01/14/1993");
			DOB.click();
			
			
			driver.findElement(By.xpath("//*[@id='positionInput']/input")).sendKeys("QA Automation");
			driver.findElement(By.xpath("//*[@id='portfolioInput']/input")).sendKeys("www.linkedin.com/in/pranjli-tiwari-20b6b0114/");
			driver.findElement(By.xpath("//*[@id='salaryInput']/input")).sendKeys("6.5LPA");
			driver.findElement(By.xpath("//*[@id='whenStartInput']/input")).sendKeys("Within 30 days");
			driver.findElement(By.xpath("//*[@id='address']")).sendKeys("Airoli navi mumbai");
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
		WebElement chooseFile= driver.findElement(By.xpath("//*[@id='resume']"));
		chooseFile.sendKeys("D:/Users/Default User/Desktop/PRANJLI RESUME.docx");
		
		driver.findElement(By.xpath("//*[@id='yes']")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.close();
		driver.quit();
		}
			}


