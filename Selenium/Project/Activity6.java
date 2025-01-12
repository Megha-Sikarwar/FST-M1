package com.project.activity;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    @BeforeClass
    public void setUp() {
    	driver.manage().window().maximize();
        driver.navigate().to("http://alchemy.hguy.co/crm");
    }    
    
    @Test
    public void login(){
    	driver.findElement(By.id("user_name")).sendKeys("admin");
    	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
    	driver.findElement(By.id("bigbutton")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'-home-icon')]")));
    	System.out.println("Login is successful");
    }
    
    @Test(dependsOnMethods = "login")
    public void checkTab(){
    	WebElement activityTab = driver.findElement(By.xpath("//a[text()='Activities']"));
    	assertEquals(true, activityTab.isDisplayed());
    	Reporter.log("Element is available on page");
    	assertEquals(true, activityTab.isEnabled());
    	Reporter.log("Element is clickable on page");
    }
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}

