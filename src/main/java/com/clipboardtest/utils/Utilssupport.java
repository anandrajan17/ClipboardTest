package com.clipboardtest.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.clipboardtest.driver.DriverManager;

public class Utilssupport {

	public void waitForElementToBePresent(By input) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(input));
	}

	public void click(By input) {
		waitForElementToBePresent(input);
		DriverManager.getDriver().findElement(input).click();
	}
	
	public void hoverAndClick(By input) {
		Actions action = new Actions(DriverManager.getDriver());
		waitForElementToBePresent(input);
		action.moveToElement(DriverManager.getDriver().findElement(input)).click().build().perform();
	}

}
