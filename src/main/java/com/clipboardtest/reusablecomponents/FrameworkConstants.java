package com.clipboardtest.reusablecomponents;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	//Getting Config file from resources folder
	private static final String CONFIGFILEPATH = System.getProperty("user.dir")+ "/resources/config.properties";

	public static String getCONFIGFILEPATH() {
		return CONFIGFILEPATH;

	}

}
