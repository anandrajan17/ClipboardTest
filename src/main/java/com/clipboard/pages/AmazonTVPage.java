package com.clipboard.pages;

import org.openqa.selenium.By;

import com.clipboardtest.constants.constantsElements;
import com.clipboardtest.extentreports.ExtentReprotAmazon;
import com.clipboardtest.utils.Utilssupport;


public class AmazonTVPage {
	
	Utilssupport utils = new Utilssupport();
	
	   public void sortByPriceHighToLow() {
	        utils.click(By.cssSelector(constantsElements.SORT_DROPDOWN));
	        utils.click(By.linkText(constantsElements.SORT_DROPDOWN_BY_HIGH_TO_LOW));
	        ExtentReprotAmazon.reprottest.pass("Samsung Televisison Price High to Low is selected");
	    }

}
