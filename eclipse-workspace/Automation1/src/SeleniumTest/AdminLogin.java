package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

private static final char[] String = null;

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\\\Users\\\\Default User\\\\Downloads\\\\chromedriver_win32 (3)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();   

driver.get("https://www.amazon.com/");
driver.manage().window().maximize();

driver.navigate().to("https://www.w3schools.com");
String URL = driver.getCurrentUrl();
System.out.println(URL);

String Title = driver.getTitle();
System.out.println(Title);

driver.navigate().back();
String Title1= driver.getTitle();
System.out.println(Title1);

driver.navigate().refresh();

driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pranjli.tiwari@gmail.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();

//driver.findElement(By.xpath("//input[@class='a-button-text' OR @role='button']")).click();
//driver.quit();
driver.close();
//driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
}}




