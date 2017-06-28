package umaPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reports.ExtentR;
import utilPakage.ExcelData;
import basePackage.Base;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Newuser extends Base{
	
	
	
	
	@Test(dataProvider="getData")
	public void tc3(String s,String s1,String s2,String s3,String s4,String s5) throws IOException
	{
		System.out.println("tc3()-start");
		rep=ExtentR.getInstance();
		test= rep.startTest("tc3Test");
		test.log(LogStatus.INFO, "Test case exection statrted");
		
		
		//initiating the browser
		init();
		//get the URL
		
		naviagate();
		
		takeScreenshot1();
		// Select the language
		select("languageSelection_name","language");
		takeScreenshot1();
		
		//Select Go button and Store 
		click("goButton_xpath");
		
		//login in as New user 
		click("account_id");
		click("creatingnewuser_linkText");
		type("firstName_id",s);
		type("lastName_id",s1);
		type("email_id",s2);
		type("newpassword_id",s3);
		type("confirmnewpassword_id",s4);
		type("phone_id",s5);
		click("createAccount_xpath");
		takeScreenshot1();
		//takeScreenshot1();
		test.log(LogStatus.INFO, "Testcase3 test end");
		
		
		

		/*rep=ExtentR.getInstance();
		test=rep.startTest("Testcase3");
		test.log(LogStatus.INFO, "Testcase3 test started");
	
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe" );
		driver= new ChromeDriver();
		test.log(LogStatus.INFO, "ChromeDriver opened");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Window Maximized");
		driver.get("http://www.bestbuy.com/");
		takeScreenshot1();
		driver.findElement(By.xpath("//html/body/div/div/table[2]/tbody/tr/td/table[1]/tbody/tr[2]/td/a")).click();
		takeScreenshot1();
		driver.findElement(By.name("button")).click();
		
				
		
		takeScreenshot1();
						
		Select s= new  Select(driver.findElement(By.name("select_locale")));
		s.selectByVisibleText("United States - English");
		driver.findElement(By.xpath("//div[@class='go_button']")).click();		
	
		test.log(LogStatus.INFO, "Go button is clicked");
		
		takeScreenshot1();
		//Clicking on Account hyperlink on top of the page to create a new account
		driver.findElement(By.id("profileMenuWrap1")).click();
		
		//Clicking on  Create a best by account to register as an new user
		driver.findElement(By.linkText("Create a My Best Buy Account")).click();
		
		
		//Creating a Account  by entering First,last,email,password,confirm password ,phone
		driver.findElement(By.id("fld-firstName")).sendKeys("testing3");
		driver.findElement(By.id("fld-lastName")).sendKeys("testing3");
		driver.findElement(By.id("fld-e")).sendKeys("testing3@gamil.com");
		driver.findElement(By.id("fld-p1")).sendKeys("Creating New Account");
		driver.findElement(By.id("fld-p2")).sendKeys("Creating New Account");
		driver.findElement(By.id("fld-phone")).clear();
		driver.findElement(By.id("fld-phone")).sendKeys("8056037399");
		
		//Clicking on  Create a Account
		driver.findElement(By.xpath("/html/body/section/main/div[1]/div[1]/div/div/form/button")).click();
		WebElement tagname =  driver.findElement(By.id("profileMenuWrap1"));
		
		takeScreenshot1();
		
		System.out.println("Crated a new Acccount" + tagname.getText());
				
				
		test.log(LogStatus.INFO, "Testcase3 test end");
		
	}

		
	
	@AfterTest
	public void end1()
	{
	rep.endTest(test);
	rep.flush();
	//driver.quit();
	}*/
	}
	
	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		String data[][];
		
		data= ExcelData.getExcelData();
		
		return data;
	}		
}
