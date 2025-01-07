package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		if(checkbox.isDisplayed() == true) {
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		if(checkbox.isDisplayed() == true) {
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.quit();
	}

}
