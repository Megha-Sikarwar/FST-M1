package StepDefinition;

import io.cucumber.java.en.Given;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Activity1 {
	private static WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

 @Given("User is on Google Home Page")
  public void user_is_on_google_home_page() {
	 driver.get("https://www.google.co.in");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='k1zIA rSk4se']")));
  }

 @When("User types in Cheese and hits ENTER")
  public void user_types_in_cheese_and_hits_enter() {
	 driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Cheese", Keys.RETURN);
  }

 @Then("Show how many search results were shown")
  public void show_how_many_search_results_were_shown() {
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
      String resultStats = driver.findElement(By.id("result-stats")).getText();
      System.out.println("Number of results found: " + resultStats);
  }

 @And("Close the browser")
  public void close_the_browser() {
	    driver.quit();
  }
}
