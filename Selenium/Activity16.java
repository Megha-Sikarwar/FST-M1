package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement dropDown = driver.findElement(By.xpath("//select[contains(@class, 'h-10')]"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Two");
		System.out.println("VIsible Text at index 2 is -  " + select.getFirstSelectedOption().getText());
		select.selectByIndex(3);
		System.out.println("VIsible Text at index 3 is -  " + select.getFirstSelectedOption().getText());
		select.selectByValue("four");
		System.out.println("VIsible Text at index 4 is -  " + select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();
		System.out.println("-----------All available options are----------------");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		driver.quit();
	}

}
