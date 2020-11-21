package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageobject {
	WebDriver driver = null;
	
	By textbox_search=By.id("realbox");
	By Button_search = By.id("realbox-icon");
	
	public void settext(String text) {
		driver.findElement(textbox_search).sendKeys(text);;
	}	
	public void buttonsearch() {
		driver.findElement(Button_search).click();
	}

	}
