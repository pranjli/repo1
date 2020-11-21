package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicecode {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
	driver.findElement(By.id("//input[@name='email']"));
    //driver.close();
	
}}
