package com.project.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity3 {
	WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        driver.navigate().to("http://alchemy.hguy.co/crm");
    }    
    
    @Test
    public void getCpText(){
    	WebElement cpText = driver.findElement(By.id("admin_options"));
    	System.out.println("Copyright Text is : " + cpText.getText());
    }
    
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}
