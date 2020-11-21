package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com");
driver.manage().window().maximize();

String s =driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]/span")).getText();
System.out.println(s);

driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

String s1=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
System.out.println(s1);
//WebElement Email =driver.findElement(By.name("identifier"));
//Email.sendKeys("pranjli");
//String Text = Email.getText();             // return a value
//System.out.println(Text);
//System.out.println(Email.isDisplayed());                                        //displayed status
//System.out.println(Email.isEnabled());              // return enabled status




////finding element using xpath locator
////driver.findElement(By.name("identifier")).sendKeys("pranjli");
//Thread.sleep(5000);
//// clear the value
//driver.findElement(By.name("identifier")).clear();
//
////return type of the object
//driver.findElement(By.name("identifier")).getAttribute("type");
	

}

}
