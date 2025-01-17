package com.project.activity;

import java.time.Duration;
import java.util.Iterator;
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

public class Activity7 {
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
    public void readAdditionlInfo() throws InterruptedException{
    	driver.findElement(By.xpath("//a[text()='Sales']")).click();
    	driver.findElement(By.xpath("//a[text()='Leads']")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody")));
    	List <WebElement> rows = driver.findElements(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody/tr/td[10]"));
		/*
		 * for (int i = 1; i < rows.size(); i++) { WebElement cell =
		 * rows.get(i).findElements(By.xpath("//*[contains(@id,'adspan')]/span")).get(i)
		 * ; cell.click(); Thread.sleep(2000); if((driver.findElement(By.xpath(
		 * "/html/body/div[4]/div/div[@role='dialog']/child::div/b[text()='Mobile:']")).
		 * getText()).contains("Mobile:")) {
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[contains(@id,'ui-id')]/span")).getText()); } }
		 */
		
		  Iterator <WebElement> itr =rows.iterator(); 
		  while(itr.hasNext()) { 
		  WebElement ele = itr.next();
		  //driver.findElement(By.xpath("//*[contains(@id,'adspan')]/span"));
		  ele.click(); 
		  Thread.sleep(2000); 
		  	if((driver.findElement(By.xpath("/html/body/div[4]/div/div[@role='dialog']/child::div/b[text()='Mobile:']")).getText()).contains("Mobile:")) {
			  System.out.println(driver.findElement(By.xpath("//*[contains(@id,'ui-id')]/span")).getText());
		  	} 
		  }
		 
    	
    }
    
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}

