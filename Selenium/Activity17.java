package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement dropDown = driver.findElement(By.cssSelector("select.h-80"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("HTML");
		for(int i=3; i<=5;i++) {
			select.selectByIndex(i);
		}
		
		select.selectByValue("nodejs");
		List<WebElement> options = select.getAllSelectedOptions();
		System.out.println("-----------All Selected options are----------------");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		select.deselectByIndex(4);
		options = select.getAllSelectedOptions();
		System.out.println("-----------All Selected options are----------------");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		driver.quit();
	}

}
