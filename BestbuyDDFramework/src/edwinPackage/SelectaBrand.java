package edwinPackage;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import reports.ExtentR;
import basePackage.Base;

import com.relevantcodes.extentreports.LogStatus;


public class SelectaBrand extends Base{

		@Test
		public void selectabrand () throws IOException
		{
			System.out.println("****Select a Brand********** ");
			
			
			
			rep=ExtentR.getInstance();
			test= rep.startTest("tc1Test");
			test.log(LogStatus.INFO, "Test case exection statrted");
			
			// launch the URL
			init();
			test.log(LogStatus.INFO, "browser open");
			 takeScreenshot1();
			// navigate to the site Best Busy
			 naviagate();
			 takeScreenshot1();
			 
			 test.log(LogStatus.INFO, "bestbuyURL open");
			 
			// Select the language
			 select("languageSelection_name","language");
			 test.log(LogStatus.INFO, "Language selected");
			 
			 takeScreenshot1();
				
			//Select Go button and Store 
			click("goButton_xpath");
			test.log(LogStatus.INFO, "Clicking go button");
			takeScreenshot1();
			
			//selecting the Brand option
			click("brand_id");
			test.log(LogStatus.INFO, "Clicking the brand button");
			 takeScreenshot1();

			//selecting the "Sony" Brand option
			click("selectSony_xpath");
			test.log(LogStatus.INFO, "Clicking the Sony brand button");
			
			//selecting the "Sony" Text option
			click("selectSonytext_xpath");
			test.log(LogStatus.INFO, "Verifying  the Sony Larger text");
			 takeScreenshot1();
		}
					
		@AfterTest
public void quit()
{
	rep.endTest(test);
	rep.flush();
}}
	
