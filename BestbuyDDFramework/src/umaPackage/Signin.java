package umaPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reports.ExtentR;
import utilPakage.ExcelData;

import com.relevantcodes.extentreports.LogStatus;

import basePackage.Base;

public class Signin extends Base {
	
	@Test(dataProvider="getData")
	public void tc4(String s,String s1) throws IOException
	{
		
		
		// Call the getInstance() method to get the Extent Report object
		rep=ExtentR.getInstance();
		// Start the test and assign that to Extent test reference variable "test"
		test=rep.startTest("Registereduser");
		// log the desired info
		test.log(LogStatus.INFO, "Signin test started");
		System.out.println("tc4() start");
		
		
		//initiating the browser
		init();
		//get the URL
		
		naviagate();
		// Select the language
		select("languageSelection_name","language");
	
		//Select Go button and Store 
		click("goButton_xpath");
		
		//Select the store locator
		click("storeLocator_xpath");
		
		//login in as Registered user 
		click("account_id");
	
		click("signIn_xpath");
		type("emailAddress_id",s);
		type("loginPassword_id",s1);
		click("signInbutton_xpath");
		
	}
	
	
	@AfterTest
	public void end1()
	{
		// To generate the report write the below two codes 
	rep.endTest(test);
	rep.flush();
	
	// close the browser
	driver.quit();
	}
	
	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		String data[][];
		
		data= ExcelData.getExcelData("Signin");
		
		return data;
	}		

}
