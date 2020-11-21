package Testing1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("tiwari.pranjli@gmail.com");
driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Mumbai@1");
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
//explicit wait
WebDriverWait wait = new WebDriverWait(driver,10);

WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")));

element.click();

Thread.sleep(2000);
String parentwindow= driver.getWindowHandle();
Set<String> windows= driver.getWindowHandles();
for(String handle: windows)
{
    if(!(handle.equals(parentwindow)))
    {
    driver.switchTo().window(handle);
    }
}
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div/ul/li[1]/button")).click();


//driver.close();

}
}
