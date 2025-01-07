package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("Page Title is : " + driver.getTitle());
		action.sendKeys("We are taking FST training").build().perform();
		WebElement message = driver.findElement(By.cssSelector("h1.mt-3"));
		System.out.println("Entered Text is - " + message.getText());	
		driver.quit();
	}

}
