package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().window().maximize();
		System.out.println("Web age title - " + driver.getTitle());
		WebElement userField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		userField.sendKeys("admin");
		passwordField.sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
