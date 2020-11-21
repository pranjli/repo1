package testing;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Class3 {
	static String username,password;
	static int iteration;

	public static void main(String[] args) {
		for(int i =1; i<=2;i++) {
		iteration = iteration+1;
		if(i==1) {
			username ="pranjli";
			password="Abcd@12";
		}
		else if(i==2){
		username = "tiwari.pranjli@gmail.com";
		password="Abcd@123";
		}
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\Default User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/mercuryreservation.php");
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("login")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("http://newtours.demoaut.com/mercurywelcome.php")) {
			System.out.println(iteration +" admin login is succesfull - Pass" );
		}
		else {
			System.out.println(iteration +" admin login is unsuccesfull - fail");
		}
		driver.close();
		
		}}	
	
}

