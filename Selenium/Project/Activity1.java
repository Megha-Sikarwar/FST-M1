package com.project.activity;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        driver.navigate().to("http://alchemy.hguy.co/crm");
    }    
    
    @Test
    public void verifyTitle(){
    	String title = driver.getTitle();
    	assertEquals("SuiteCRM", title);
    }
    
    @AfterClass
    public void tearDown() {
    	if(driver.getTitle().equals("SuiteCRM"))
    	{
    		driver.quit();
    	}else {
    		System.out.println("Invalid tilte");
    	}
        
    }
}
