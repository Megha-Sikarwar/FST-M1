package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page Title is : " + driver.getTitle());
		List <WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'able-auto')]/tbody/tr"));
		List <WebElement> col = driver.findElements(By.xpath("//table[contains(@class, 'able-auto')]/tbody/tr/td"));
		System.out.println("Number of rows are : "+ row.size());
		System.out.println("Number of cols are : "+ col.size());
		List <WebElement> tRow = driver.findElements(By.xpath("//table[contains(@class, 'able-auto')]/tbody/tr[3]"));
		for(WebElement thirdRow : tRow) {
			System.out.println("3rd Row Data : " + thirdRow.getText());
		}
		String cellVal = driver.findElement(By.xpath("//table[contains(@class, 'able-auto')]/tbody/tr[2]/td[2]")).getText();
		System.out.println("2nd cell for 2nd row val is : " + cellVal);
		driver.quit();
	}

}
