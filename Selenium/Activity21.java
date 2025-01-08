package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text() = 'Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Number of browser windows opend : " + driver.getWindowHandles().size());
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
		System.out.println("New Window title is : " + driver.getTitle());
		driver.findElement(By.xpath("//button[text() = 'Open Another One']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Number of browser windows opend : " + driver.getWindowHandles().size());
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
		System.out.println("New Window title is : " + driver.getTitle());
		driver.quit();
	}

}
