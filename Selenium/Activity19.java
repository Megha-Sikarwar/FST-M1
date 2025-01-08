package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity19 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("confirmation")).click();
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Success message :" + driver.findElement(By.id("result")).getText());
		
		driver.findElement(By.id("confirmation")).click();
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println("Success message :" + driver.findElement(By.id("result")).getText());
		driver.quit();
	}

}
