package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.ByteArrayDataOutput;

public class Practice {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("pranjli");
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).getAttribute("Value");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");

//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("tiwari.pranjli@gmail.com");	
//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P9044887012t@");
//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

//driver.findElement(By.xpath("//input[@name='identifier']")).getAttribute("Value");  //input[@name= 'identifier']
//driver.close();

		
		
}
}
