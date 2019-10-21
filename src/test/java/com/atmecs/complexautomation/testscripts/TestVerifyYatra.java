package com.atmecs.complexautomation.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.complexautomation.constants.FileConstants;
import com.atmecs.complexautomation.helper.SeleniumHelper;
import com.atmecs.complexautomation.logreports.LogReporter;
import com.atmecs.complexautomation.testbase.TestBase;
import com.atmecs.complexautomation.utils.PropertiesReader;

public class TestVerifyYatra extends TestBase
{
	LogReporter log=new LogReporter();
	PropertiesReader propread=new PropertiesReader();
	SeleniumHelper help=new SeleniumHelper();
	@Test
	public void verifyYatra() throws IOException 
	{
		Properties prop1=propread.KeyValueLoader(FileConstants.LOCATOR_PATH);
		driver.get(prop.getProperty("url1"));
		log.logReportMessage("url is loaded");
		logger=extentObject.startTest("yatra test");
		help.clickElement(driver, prop1.getProperty("loc.img.couponcode"));
	}
}
