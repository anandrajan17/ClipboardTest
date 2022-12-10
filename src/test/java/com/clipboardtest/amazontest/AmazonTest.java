package com.clipboardtest.amazontest;

import org.testng.annotations.Test;

import com.clipboard.pages.AmazonHomePage;
import com.clipboardtest.chromelauncher.chromelauncher;
import com.clipboardtest.extentreports.ExtentReprotAmazon;



public class AmazonTest extends chromelauncher  {

	private AmazonTest (){

	}

	@Test

	public void amazon_test() {
		
		ExtentReprotAmazon.testcase("Amazon TV Test");
		
		AmazonHomePage TestcaseExe = new AmazonHomePage();
		TestcaseExe.clickHamburger();
		
		TestcaseExe.selectTVAppliance();
		TestcaseExe.selectTelevison();
		TestcaseExe.selectCheckoxIntoTitle("Brands", "Samsung");
		

		System.out.println("Test has Executed successfully");

	}

}
