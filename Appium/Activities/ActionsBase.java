package com.appiumActivity;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class ActionsBase {
	 private final static PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	 
	    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
			/*
			 * Sequence swipe = new Sequence(finger, 1)
			 * .addAction(finger.createPointerMove(Duration.ofMillis(0), viewport(),
			 * start.getX(), start.getY()))
			 * .addAction(finger.createPointerDown(LEFT.asArg()))
			 * .addAction(finger.createPointerMove(Duration.ofMillis(duration), viewport(),
			 * end.getX(), end.getY())) .addAction(finger.createPointerUp(LEFT.asArg()));
			 * driver.perform(Arrays.asList(swipe));
			 */
	    }
}
