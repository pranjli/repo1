package mercurytour;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BatchTesting {
	static String username;
	static String password; 
	static int iteration;
		
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
//		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//*[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")).click();
		driver.findElement(By.xpath("//*[contains(@href, '/login?referer=https://www.myntra.com/')]")).click();
		driver.findElement(By.xpath("//*[@class='form-control mobileNumberInput']")).sendKeys("7066540633");
		driver.findElement(By.xpath("//*[@class='submitBottomOption']")).click();
		
		int elementcount =driver.findElements(By.xpath("//h3[text()='Verify with OTP']")).size();
        System.out.println(elementcount);
		if(elementcount>0) 
		{
		Thread.sleep(10000);
		System.out.println("if");
		}
		else 
		{
		Thread.sleep(3000);	
		System.out.println("else");
//WebDriverWait wait = new WebDriverWait (driver,5000);

		driver.findElement(By.xpath("//*[@type='password' and @class='form-control has-feedback']")).sendKeys("Abcd@1234");
        driver.findElement(By.xpath("//*[@class='btn primary  lg block submitButton']")).click();
		}
        Thread.sleep(30000);
        
       	    driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("tops");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='desktop-suggestion null']")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[contains(@alt,'SASSAFRAS Women Grey Solid Layered Cropped Blouson Top')]")).click();
	    
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//*[@id=\'sizeButtonsContainer\']/div[2]/div[1]/div[1]/button")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[contains(text(),'ADD TO BAG')]")).click();
//      WebDriverWait wait = new WebDriverWait (driver,10000);
//        Thread.sleep(9000);
//       driver.findElement(By.xpath("//*[contains(@href,'/checkout/cart')]")).click();
//		
//	    driver.findElement(By.xpath("//*[@class='button-base-button emptyCart-base-wishlistButton']")).click();
//	    driver.findElement(By.xpath("//a[text()='CONTINUE SHOPPING']")).click();
//	    
	    
//driver.close();
}}

