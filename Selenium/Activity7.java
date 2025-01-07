package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement textField = driver.findElement(By.id("textInput"));
		if(textField.isEnabled() == true) {
			System.out.println("field is enabled");
		}
		else {
			System.out.println("field is not enabled");
		}
		driver.findElement(By.id("textInputButton")).click();
		if(textField.isEnabled() == true) {
			System.out.println("Field is enabled");
		}
		else {
			System.out.println("Field is not enabled");
		}
		driver.quit();
	}

}
