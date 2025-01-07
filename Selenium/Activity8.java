package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement cargoLock = driver.findElement(By.xpath("//div/following::h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//div/following::h1[text()='Cargo.toml']"));
		action.click(cargoLock).moveToElement(cargoToml).click(cargoToml).build().perform();
		System.out.println("Confirmation message1 - " + driver.findElement(By.id("result")).getText());
		WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));
		action.doubleClick(src).moveToElement(target).contextClick(target).build().perform();
		WebElement openButton = driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"));
		action.click(openButton).build().perform();
		System.out.println("Confirmation message2 - " + driver.findElement(By.id("result")).getText());	
		driver.quit();
	}

}
