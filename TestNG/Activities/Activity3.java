package Activities;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
    @BeforeClass
    public void setUp() {
    	driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/login-form/");
    }
    @Test
    public void login() {
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.id("password")).sendKeys("password");
    	driver.findElement(By.xpath("//button[text() ='Submit']")).click();
    	assertEquals(driver.findElement(By.xpath("//h2[contains(text(), 'Welcome Back')]")).getText(), "Welcome Back, Admin!");
    	
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
