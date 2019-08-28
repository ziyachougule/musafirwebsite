package com.musafirwebsite.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.musafirwebsite.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		driver.manage().window().maximize();
		lp.setEmail(email);
		logger.info("Entered email");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickLogin();
		logger.info("Clicked on Login Button");
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Dashboard - Musafir"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
	
}
