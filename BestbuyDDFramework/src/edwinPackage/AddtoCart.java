package edwinPackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import reports.ExtentR;

import com.relevantcodes.extentreports.LogStatus;

import basePackage.Base;

// Base class is extended
public class AddtoCart extends Base{
	
	@Test
	public void addtoCart () throws IOException
	{
		System.out.println("****Add to cart*********** ");
		
		
		
		rep=ExtentR.getInstance();
		test= rep.startTest("tc1Test");
		test.log(LogStatus.INFO, "Test case exection statrted");
		
		// launch the URL
		init();
		test.log(LogStatus.INFO, "browser open");
		// navigate to the site Best Busy
		 naviagate();
		 
		 test.log(LogStatus.INFO, "bestbuyURL open");
		 
		// Select the language
		 select("languageSelection_name","language");
		 test.log(LogStatus.INFO, "Language selected");
		 
		 takeScreenshot1();
			
		//Select Go button and Store 
		click("goButton_xpath");
		test.log(LogStatus.INFO, "Clicking go button");
	
		takeScreenshot1();
		
		type("searchBox_id","searchTextE");
		test.log(LogStatus.INFO, "searching for an item");
		click("searchButton_xpath");
		test.log(LogStatus.INFO, "Clicking search button");
		click("firstItem_xpath");
		test.log(LogStatus.INFO, "Clicking the first item");
		click("addToCart_xpath");
		test.log(LogStatus.INFO, "item added to the cart");
		takeScreenshot1();
		test.log(LogStatus.PASS, "Test case is passed");
		 
		 
		 
		
	}
	
	@AfterTest
	public void quit()
	{
		rep.endTest(test);
		rep.flush();
		
	}
	

}
