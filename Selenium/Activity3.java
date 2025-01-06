package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().window().maximize();
		System.out.println("Web age title - " + driver.getTitle());
		WebElement userField = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		userField.sendKeys("admin");
		passwordField.sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
