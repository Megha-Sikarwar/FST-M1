package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Page Title is : " + driver.getTitle());
		WebElement ele1 = driver.findElement(By.id("ball"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement ele3 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
		action.clickAndHold(ele1).moveToElement(ele2).build().perform();
		if(ele2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
		action.clickAndHold(ele1).dragAndDrop(ele2,ele3).build().perform();
		if(ele3.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }
		driver.quit();
	}

}
