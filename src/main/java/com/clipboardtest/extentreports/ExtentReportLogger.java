package com.clipboardtest.extentreports;


//Extentreporter Logger 
public final class ExtentReportLogger {
	
	private ExtentReportLogger() {}
		
		public static void pass(String message) {
			ExtentReprotAmazon.reprottest.pass(message);
			
		}
		
		public static void fail(String message) {
			ExtentReprotAmazon.reprottest.fail(message);
			
		}
		
		public static void skip(String message) {
			ExtentReprotAmazon.reprottest.skip(message);
			
		}
		
	

}