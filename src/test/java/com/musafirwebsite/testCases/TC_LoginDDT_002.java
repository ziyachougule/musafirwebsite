package com.musafirwebsite.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.musafirwebsite.PageObjects.LoginPage;
import com.musafirwebsite.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String email,String password) throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
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

			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		lp.appLogout();
		
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/musafirwebsite/testData/LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colcount = XLUtils.getCellCount(path, "sheet1" ,1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
		
}
	

