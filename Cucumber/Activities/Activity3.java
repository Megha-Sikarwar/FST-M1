package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity3 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	Alert alt;
	@Given("User is on the page")
	public void user_is_on_the_page() {
		driver.get("https://training-support.net/webelements/alerts");
	}

	@When("User clicks the Simple Alert button")
	public void user_clicks_the_simple_alert_button() {
		driver.findElement(By.id("simple")).click();
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		
	}

	@Then("Alert opens")
	public void alert_opens() {
		alt = driver.switchTo().alert();
	}

	@Then("Read the text from it and print it")
	public void read_the_text_from_it_and_print_it() {
		System.out.println("Success message :" + alt.getText());
	}

	@Then("Close the alert")
	public void close_the_alert() {
		alt.accept();
	}

	@When("User clicks the Confirm Alert button")
	public void user_clicks_the_confirm_alert_button() {
		driver.findElement(By.id("confirmation")).click();
	}

	@Then("Close the alert with Cancel")
	public void close_the_alert_with_cancel() {
		alt.dismiss();
	}

	@When("User clicks the Prompt Alert button")
	public void user_clicks_the_prompt_alert_button() {
		driver.findElement(By.id("prompt")).click();
	}

	@Then("Write a custom message in it")
	public void write_a_custom_message_in_it() {
		driver.switchTo().alert().sendKeys("Awesome!!");
	}
}
