package com.musafirwebsite.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.musafirwebsite.PageObjects.AddNewTripPage;
import com.musafirwebsite.PageObjects.LoginPage;

public class TC_AddNewTrips_003 extends BaseClass
{
	
	@Test
	public void addNewTrip() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		driver.manage().window().maximize();
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		logger.info("Logged in using admin");
		
		Thread.sleep(3000);
		
		AddNewTripPage addtrip = new AddNewTripPage(driver);
		
		addtrip.navToTripPage();
		addtrip.clickonAddTrip();
		logger.info("Adding trip details");
		
		String fname=randomstring() + "fn";
		addtrip.custFistName(fname);
		
		String lname=randomstring() + "ln";
		addtrip.custLastName(lname);
		
		String email=randomstring() + "@gmail.com";
		addtrip.custEmailaddr(email);
		Thread.sleep(2000);
		
		String mobnum=randomNum();
		addtrip.custMobNo(mobnum);
		Thread.sleep(2000);
		
		addtrip.createTrip();
		logger.info("Clicked on create trip");
		Thread.sleep(3000);
		logger.info("Validation started");
		
		boolean res =driver.getPageSource().contains("This trip has just been created");
		
		if (res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is passed");
		}
		else
		{
			logger.info("Test case is failed");
			captureScreen(driver, "addNewTrip");
			Assert.assertTrue(false);
		}
			
			
	}
	
}
