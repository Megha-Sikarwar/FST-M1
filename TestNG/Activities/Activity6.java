package SuiteTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class Activity6 {
	WebDriver driver;
	
	@BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }
 
    @Test
    @Parameters({"userName", "password"})
    public void loginTest(String userName, String password) {
    	driver.findElement(By.id("username")).sendKeys(userName);
    	driver.findElement(By.id("password")).sendKeys(password);
    	driver.findElement(By.xpath("//button[text() ='Submit']")).click();
    	assertEquals(driver.findElement(By.xpath("//h2[contains(text(), 'Welcome Back')]")).getText(), "Welcome Back, Admin!");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
