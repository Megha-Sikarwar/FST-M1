package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		driver.manage().window().maximize();
		System.out.println("Web age title - " + driver.getTitle());
		String thirdHeader = driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
		System.out.println("Text for 3rd header is : " + thirdHeader);
		String fifthHeader = driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
		System.out.println("Text for 5th header is : " + fifthHeader);
		WebElement purpleButton = driver.findElement(By.xpath("//button[text()='Purple']"));
		System.out.println("Class name for Purple button is : " + purpleButton.getDomAttribute("class"));
		String slateButton = driver.findElement(By.xpath("//button[text()='Slate']")).getText();
		System.out.println("Text for Slate button is : " + slateButton);
		driver.quit();
		
	}

}
