package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity2 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver.get("https://training-support.net/webelements/login-form");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("Read the page title and confirmation message")
	public void read_the_page_title_and_confirmation_message() throws InterruptedException {
		Thread.sleep(200);
		String confMsg = driver.findElement(By.xpath("//h1[contains(@class, 'text-center')]")).getText();
		System.out.println("Page Title is : " + driver.getTitle());
		System.out.println("Confirmation message is : " + confMsg);
	}
}
