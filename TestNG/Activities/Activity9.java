package SuiteTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity9 {
WebDriver driver;
	
	@BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(" https://training-support.net/webelements/alerts");
    }
	@BeforeMethod
	public void switchAlert() {
		driver.switchTo().defaultContent();
	}
    @Test(priority=1)
    public void simpleAlertTestCase() {
    	driver.findElement(By.id("simple")).click();
    	Reporter.log("Alert popup opened!!");
    	assertEquals("You've just triggered a simple alert!", driver.switchTo().alert().getText());
    	driver.switchTo().alert().accept();
    	
    }
    @Test(priority=2)
    public void confirmAlertTestCase() {
    	driver.findElement(By.id("confirmation")).click();
    	Reporter.log("Confirmation alert popup opened!!");
    	assertEquals("You've just triggered a confirmation alert!", driver.switchTo().alert().getText());
    	driver.switchTo().alert().accept();
    }
    @Test(priority=3)
    @Parameters({"message"})
    public void promptAlertTestCase(String message) throws InterruptedException {
    	driver.findElement(By.id("prompt")).click();
    	Reporter.log("Prompt Alert opened !!");
    	Thread.sleep(200);
    	driver.switchTo().alert().sendKeys(message);
    	Reporter.log("Entered " + message + " in the prompt box !!");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
