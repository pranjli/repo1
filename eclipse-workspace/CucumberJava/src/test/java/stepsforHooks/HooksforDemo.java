package stepsforHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksforDemo {
	WebDriver driver = null;

//	@Before(order=1)
	@Before("@smoke")
	public void browsersetup() {
		System.out.println("I am inside browser set-up");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjlti\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order=0)
	public void browser2() {
		System.out.println("i am in browser2  ");
	}
	@After(order=1)
	public void teardown() {
		System.out.println("i am inside teardown");
		driver.close();
		driver.quit();
	}
	@After(order=2)
	public void teardown2() {
		System.out.println("i am inside teardown2------------\n");
	}
    @BeforeStep
	public void beforestep() {
		System.out.println("   I am in before step+++++++++++++++");
	}
	
   @AfterStep
    public void afterstep() {
    	System.out.println("I am in after setp++++++++++++");
    	
    }
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {

	}

	@And("enter login button")
	public void enter_login_button() {

	}


	@Then("navigated to homepage")
	public void navigated_to_homepage() {

	}

}
