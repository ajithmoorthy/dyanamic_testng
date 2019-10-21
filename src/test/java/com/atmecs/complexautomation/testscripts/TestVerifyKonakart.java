package com.atmecs.complexautomation.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.complexautomation.constants.FileConstants;
import com.atmecs.complexautomation.helper.SeleniumHelper;
import com.atmecs.complexautomation.logreports.LogReporter;
import com.atmecs.complexautomation.testbase.TestBase;
import com.atmecs.complexautomation.utils.PropertiesReader;

public class TestVerifyKonakart extends TestBase
{
	LogReporter log=new LogReporter();
	PropertiesReader propread=new PropertiesReader();
	SeleniumHelper help=new SeleniumHelper();
	@Test
	public void verifyKonaKart() throws IOException 
	{
		Properties prop1=propread.KeyValueLoader(FileConstants.LOCATOR_PATH);
		driver.get(prop.getProperty("url2"));
		log.logReportMessage("url is loaded");
		logger=extentObject.startTest("konakart test");
		help.clickElement(driver, prop1.getProperty("loc.img.hero"));
		help.clickElement(driver,  prop1.getProperty("loc.tab.reviews"));
	}

}
