package org.test;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLoginPageTest extends Baseclass{
	
	
	@Given("user have to open the url in the browser")
	public void setup() throws IOException {
	   
		FbLoginPageTest.browserSetup("\\src\\test\\resources\\propertyFiles\\data.properties");
		
	}

	@When("user enter the invalid username in the username field")
	public void user_enter_the_invalid_username_in_the_username_field() {
	   driver.findElement(By.id("email")).sendKeys("ornaium123");
	}

	@When("user enter the invalid password in te password field")
	public void user_enter_the_invalid_password_in_te_password_field() {
	    driver.findElement(By.id("pass")).sendKeys("3894170");
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() throws InterruptedException {
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}

	@Then("user should be on the error page")
	public void user_should_be_on_the_error_page() {
			WebElement element = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
			
			Assert.assertTrue(element.isDisplayed());
				
	}


}
