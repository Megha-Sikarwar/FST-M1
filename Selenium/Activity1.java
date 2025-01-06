package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net");
		System.out.println("Web age title - " + driver.getTitle());
		WebElement button = driver.findElement(By.xpath("//a[text()='About Us']"));
		button.click();
		driver.quit();
	}

}
