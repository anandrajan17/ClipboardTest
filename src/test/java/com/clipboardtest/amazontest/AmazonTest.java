package com.clipboardtest.amazontest;

import org.testng.annotations.Test;

import com.clipboard.pages.AmazonHomePage;
import com.clipboard.pages.AmazonTVPage;
import com.clipboard.pages.AmazonTvDetails;
import com.clipboard.pages.AmazonTvResult;
import com.clipboardtest.chromelauncher.chromelauncher;
import com.clipboardtest.extentreports.ExtentReprotAmazon;
import com.clipboardtest.utils.Utilssupport;



public class AmazonTest extends chromelauncher  {

	private AmazonTest (){

	}

	@Test

	public void amazon_test() {
		
		ExtentReprotAmazon.testcase("Amazon TV Test");
		
		AmazonHomePage TestcaseExe = new AmazonHomePage();
		AmazonTVPage FilterExe = new AmazonTVPage();
		AmazonTvResult ResultExe = new AmazonTvResult();
		Utilssupport UtilExe = new Utilssupport();
		AmazonTvDetails DetailExe = new AmazonTvDetails();
		
		
		TestcaseExe.clickHamburger();
		
		TestcaseExe.selectTVAppliance();
		TestcaseExe.selectTelevison();
		TestcaseExe.selectCheckoxIntoTitle("Brands", "Samsung");
		FilterExe.sortByPriceHighToLow();
		ResultExe.selectResultByIndex(0);
		UtilExe.switchTab(1);
		
		

		System.out.println("Test has Executed successfully");

	}

}
