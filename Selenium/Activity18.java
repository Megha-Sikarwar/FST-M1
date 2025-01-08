package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity18 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("simple")).click();
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Success message :" + driver.findElement(By.id("result")).getText());
		driver.quit();
	}

}
