package com.project.activity;

import java.time.Duration;
import java.util.ArrayList;
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

public class Activity8 {
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
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Accounts']")));
    	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody")));
    	List <WebElement> rows = driver.findElements(By.xpath("//form[@id='MassUpdate']//table[@class='list view table-responsive']/tbody/tr"));
    	List<Integer> oddNumbers = new ArrayList<>();
    	 for (int i = 1; i < rows.size(); i++) {  // Skipping the header row
             WebElement cell = rows.get(i).findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr/td[3]")).get(i);

             if (i % 2 != 0) {
                 oddNumbers.add(i);
                 System.out.println("First odd-numbered is : " + i + " and value is : "+ cell.getText());
             }
             if (oddNumbers.size() == 5) {
                 break;
             }
         }
         
    }
    
    @AfterClass
    public void tearDown() {
    		driver.quit();
    }
}

