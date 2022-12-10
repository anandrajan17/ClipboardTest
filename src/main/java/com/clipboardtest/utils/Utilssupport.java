package com.clipboardtest.utils;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.clipboardtest.driver.DriverManager;
import com.clipboardtest.extentreports.ExtentReprotAmazon;

/**
 * support functions for actions Click,Mouse over click,wait for element,switching tabs
 * @author Anandha 
 * @version 1.0
 * @since 1.0
 */



public class Utilssupport {
	//Wait for element 
	public void waitForElementToBePresent(By input) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(input));
	}
	//Click the element passed
	public void click(By input) {
		waitForElementToBePresent(input);
		DriverManager.getDriver().findElement(input).click();
	}
	//Hover and click the found element 
	public void hoverAndClick(By input) {
		Actions action = new Actions(DriverManager.getDriver());
		waitForElementToBePresent(input);
		action.moveToElement(DriverManager.getDriver().findElement(input)).click().build().perform();
	}
	//Switch the tabs 
	public void switchTab(int tabIndex) {
		ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs.get(tabIndex));
		ExtentReprotAmazon.reprottest.pass("Individual Second highest TV tab is switched");
	}

}
