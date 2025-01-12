package com.project.activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    @BeforeClass
    public void setUp() {
    	driver.manage().window().maximize();
        driver.navigate().to("http://alchemy.hguy.co/crm");
    }    
    
    @Test(priority = 0, alwaysRun = true)
    public void login(){
    	driver.findElement(By.id("user_name")).sendKeys("admin");
    	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
    	driver.findElement(By.id("bigbutton")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'-home-icon')]")));
    	System.out.println("Login is successful");
    }
    
    @Test(dependsOnMethods = "login")
    public void readAdditionlInfo(){
    	driver.findElement(By.xpath("//a[text()='Sales']")).click();
    	driver.findElement(By.xpath("//a[text()='Leads']")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody")));
    	List <WebElement> rows = driver.findElements(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody/tr"));
    	for(int i =1; i<rows.size();i++) {
    		List <WebElement> cols = rows.get(i).findElements(By.xpath("//td[10]/span/span"));
    		for(int j =1; j<=10;j++) {
    			System.out.println("Hello");
    		}
    	}
    }
    
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}

