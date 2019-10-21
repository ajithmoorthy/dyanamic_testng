package com.atmecs.complexautomation.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.complexautomation.constants.FileConstants;
import com.atmecs.complexautomation.helper.SeleniumHelper;
import com.atmecs.complexautomation.logreports.LogReporter;
import com.atmecs.complexautomation.testbase.TestBase;
import com.atmecs.complexautomation.utils.PropertiesReader;

public class TestVerifyRedbus extends TestBase
{
	LogReporter log=new LogReporter();
	PropertiesReader propread=new PropertiesReader();
	SeleniumHelper help=new SeleniumHelper();
	@Test
	public void verifyRedbus() throws IOException 
	{
		Properties prop1=propread.KeyValueLoader(FileConstants.LOCATOR_PATH);
		driver.get(prop.getProperty("url"));
		log.logReportMessage("url is loaded");
		logger=extentObject.startTest("redbus test");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		help.clickElement(driver,prop1.getProperty("loc.date.from"));
	}
}
