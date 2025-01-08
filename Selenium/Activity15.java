package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Page Title is : " + driver.getTitle());
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Megha");
		driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("megha.sikarawr@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, '-event-date')]")).sendKeys("12/12/2025");
		driver.findElement(By.xpath("//textarea[contains(@id, 'additional-details')]")).sendKeys("Please do come!!");
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement msg = driver.findElement(By.id("action-confirmation"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
		System.out.println("Confirmation messgae is -  " + msg.getText());
		driver.quit();
	}

}
