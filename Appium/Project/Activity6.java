package com.project.activity;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity6 {
	AndroidDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();
		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, options);
	}
    @Test(alwaysRun = true)
    public void scrollToPage() {
    	/*Dimension dims = driver.manage().window().getSize();
		
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .77));
		Point end = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .77));
		
		ActionsBase.doSwipe(driver, start, end, 2000);*/
    }
	@Test
	public void loginWithCorrectDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button")));
		driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text,'Popups')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In \"]")).click();
		driver.findElement(AppiumBy.id("username")).sendKeys("admin");
		driver.findElement(AppiumBy.id("password")).sendKeys("password");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		String msg = driver.findElement(AppiumBy.id("action-confirmation")).getText();
		Assert.assertEquals(msg, "Welcome Back, admin");
	}
	@Test
	public void loginWithIncorrectDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button")));
		driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text,'Popups')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In \"]")).click();
		driver.findElement(AppiumBy.id("username")).sendKeys("admin");
		driver.findElement(AppiumBy.id("password")).sendKeys("passwords");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		String msg = driver.findElement(AppiumBy.id("action-confirmation")).getText();
		Assert.assertEquals(msg, "Invalid Credentials");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
