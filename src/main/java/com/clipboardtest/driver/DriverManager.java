package com.clipboardtest.driver;
import org.openqa.selenium.WebDriver;

/**
 * DriverManager class to invoke webdriver ,url and Quit browser 
 * @author Anand
 *
 */

public final class DriverManager {

	
	private DriverManager() {

	}

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver driverref) {
		driver.set(driverref);
	}

	public static void unload() {
		driver.remove();	}
}
