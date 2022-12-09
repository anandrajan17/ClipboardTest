package com.clipboardtest.driver;
import org.openqa.selenium.WebDriver;

public final class DriverManager {

	//Driver function to get,set Url,Unload Driver 
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
