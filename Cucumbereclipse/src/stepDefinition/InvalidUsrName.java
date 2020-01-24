package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidUsrName {
	
	WebDriver driver;

	@Given("^start application$")
	public void start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	   driver.manage().window().maximize();
	}

	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Pravenya@123");
	    

	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	    driver.navigate().refresh();
	}
	}
