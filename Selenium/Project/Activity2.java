package com.project.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class Activity2 {
	WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        driver.navigate().to("http://alchemy.hguy.co/crm");
    }    
    
    @Test
    public void getImageURL(){
    	WebElement img = driver.findElement(By.xpath("//div[@class='companylogo']/img"));
    	String imgURL = img.getDomAttribute("src");
    	Reporter.log("URL for the image is " + imgURL);
    }
    
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}
