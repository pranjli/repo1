package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Firstdemo {

	WebDriver driver = null;


	@Given("Browser is open")
	public void Browser_is_open() {
		System.out.println("browser is open");
		
		String projectPath= System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath);

		System.setProperty("webdiver.chrome.driver",projectPath+"src/test/resources/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@And("User is on login page")
	public void User_is_on_login_page(){
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("user enter (.*) and (.*)")
	public void user_enter_valid_username_and_password(String username,String password) {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}


	@And("hit login button")
	public void hit_login_button(){
		driver.findElement(By.id("login")).click();
	}
	@Then("user able to navigate login page")
	public void user_able_to_navigate_login_page() {
		driver.findElement(By.id("logout")).isEnabled();
		driver.close();
		driver.quit();

	}

}
