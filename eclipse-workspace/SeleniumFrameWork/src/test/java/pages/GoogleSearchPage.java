package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element = null;

	public static WebElement google_search(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@id='realbox']"));
		return element;
	}

	public static WebElement button(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}
	public static void main(String[] args) {

	}

}
