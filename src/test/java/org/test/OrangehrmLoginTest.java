package org.test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangehrmLoginTest {
	WebDriver driver;
	
	@Before(value="@regression",order = -1)
	public void before() {
		System.out.println("It is a before method");
	}
	
	@Before(order = 0)
	public void setup() {
		driver = new ChromeDriver();;
	}
	
	@Before(order=1)
	public void url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Given("user launches the orangehrm page in the browser")
	public void user_launches_the_orangehrm_page_in_the_browser() {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user enter the username {string} in the orangehrm page username field")
	public void user_enter_the_username_in_the_orangehrm_page_username_field(String username) {
	   driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("user enter the password {string} in the orangehrm page password field")
	public void user_enter_the_password_in_the_orangehrm_page_password_field(String password) {
	   driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user click on the orangehrm page login button")
	public void user_click_on_the_orangehrm_page_login_button() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	}

	@Then("user should see the orangehrm page dashboard")
	public void user_should_see_the_orangehrm_page_dashboard() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	    driver.quit();
	}



	@Then("user should see the orangehrm page login page")
	public void user_should_see_the_orangehrm_page_login_page() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
	}
	@After(order = 1,value="@regression")
	public void after() {
		System.out.println("it is after method");
	}
	
	@After(order = 0)
	public void tear() {
		 driver.quit();
	}
	
	@After(order = -1)
	public void completion() {
		System.out.println("test completed");
	}

}
