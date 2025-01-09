package Activities;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        driver.get("https://training-support.net/webelements/target-practice");
    }
    
    @Test
    public void test1(){
    	assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }
    @Test
    public void test2(){
    	WebElement button = driver.findElement(By.xpath("//button[text()='Teal']"));
        assertEquals(button.getText(), "Orange"); 	
    }
    @Test(enabled = false)
    public void test3(){
    	assertEquals("Training Support", driver.findElement(By.xpath("//h1[text()='Training Support']")).getText());
    	driver.findElement(By.xpath("//a[text() = 'About Us']")).click();
    }
    @Test
    public void test4(){
    	WebElement button = driver.findElement(By.xpath("//button[text()='Slate']"));
    	String text = button.getText();
        if(text.equals("Slate")) {
        	throw new SkipException("Skipped");
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
