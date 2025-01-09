package Activities;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        driver.get("https://training-support.net");
    }    
    
    @Test(priority =1)
    public void test1(){
    	assertEquals("Training Support", driver.findElement(By.xpath("//h1[text()='Training Support']")).getText());
    	driver.findElement(By.xpath("//a[text() = 'About Us']")).click();
    }
    @Test(priority =2)
    public void test2() throws InterruptedException{
    	Thread.sleep(2000);
        assertEquals("About Training Support", driver.getTitle()); 	
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
