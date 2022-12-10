package com.clipboard.pages;

import org.openqa.selenium.By;

import com.clipboardtest.constants.constantsElements;
import com.clipboardtest.driver.DriverManager;
import com.clipboardtest.extentreports.ExtentReprotAmazon;


public class AmazonTvResult {
	
	public void selectResultByIndex(int index) {
        DriverManager.getDriver().findElements(By.cssSelector(constantsElements.MAIN_SEARCH_RESULT_IMAGES)).get(index + 1).click();
        ExtentReprotAmazon.reprottest.pass("Second Highest priced TV is selected");
    }

}
