package com.clipboard.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.clipboardtest.constants.constantsElements;
import com.clipboardtest.driver.DriverManager;
import com.clipboardtest.extentreports.ExtentReprotAmazon;
import com.clipboardtest.utils.Utilssupport;

/**
 * Amazon TV details
 * @author Anandha
 *
 */

public class AmazonTvDetails {
	
	Utilssupport utils = new Utilssupport();
	//Get about this item in the TV page
	 public String getAboutThisItemSectionText() {
	        utils.waitForElementToBePresent(By.cssSelector(constantsElements.ABOUT_THIS_ITEM_SECTION_TEXT));
	        ExtentReprotAmazon.reprottest.pass("About the Item is fecthed");
	        return DriverManager.getDriver().findElement(By.cssSelector(constantsElements.ABOUT_THIS_ITEM_SECTION_TEXT)).getText();
	        
	    }
	 //Get the Deatils of the about list 
	    public List<WebElement> getBulletList() {
	        utils.waitForElementToBePresent(By.cssSelector(constantsElements.ABOUT_THIS_ITEM_BULLETS));
	        return DriverManager.getDriver().findElements(By.cssSelector(constantsElements.ABOUT_THIS_ITEM_BULLETS));
	    }

}
