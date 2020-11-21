package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	By txt_username = By.id("name");
	By txt_password=By.id("password");
	By login=By.id("login");

	
	public void validlogin(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);	
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(login).click();
	}
	
	
	
	public void invalidlogin() {
		
	}
}
