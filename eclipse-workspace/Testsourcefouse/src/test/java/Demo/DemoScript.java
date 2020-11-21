package Demo;

import java.awt.Dimension;
import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoScript {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/pranjlti/eclipse-workspace/Testsourcefouse/Driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/mnjuser/homepage");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.findElement(By.xpath("//*[@id='usernameField']")).sendKeys("tiwari.pranjli@gmail.com");
driver.findElement(By.xpath("//*[@id='passwordField']")).sendKeys("Abcd@1234");
driver.findElement(By.xpath("//*[@id='loginForm']/div[3]/div[3]/div/button[1]")).click();
Thread.sleep(2000);

driver.manage().window().minimize();

//Dimension n = new Dimension(390,300);
//driver.manage().window().setSize(n);
////driver.manage().window().setPosition(new Point(-2000,0));
//driver.manage().window().setPosition(new Point(0,-2000));

//return parent window name
//String mainwindow=driver.getWindowHandle();
//
////no of window open by driver
//Set<String> set = driver.getWindowHandles();
//
////Using Iterator to iterate with in windows
//Iterator<String> itr = set.iterator(); 
//while(itr.hasNext()) {
//	String childWindow=itr.next();
//	// Compare whether the main windows is not equal to child window. If not equal, we will close.
//	if(!mainwindow.equals(childWindow)){
//	driver.switchTo().window(childWindow);
//	System.out.println(driver.switchTo().window(childWindow).getTitle());
//}
//Select dropdown = new Select(myselctele);
//dropdown.selectByVisibleText("Offers Module");
//	driver.close();
//		WebElement ele = driver.findElement(By.xpath("//div[contains(@class, 'mTxt') and  text()='Recruiters']"));
//	Actions action = new Actions(driver);
//	action.moveToElement(ele).perform();
	}

	}





















