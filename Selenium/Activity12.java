package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement button = driver.findElement(By.id("genButton"));
		button.click();
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"))) {
			System.out.println("Founded word is : " + driver.findElement(By.id("word")).getText());
		}
		driver.quit();
	}

}
