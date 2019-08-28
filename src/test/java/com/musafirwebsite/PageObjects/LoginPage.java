package com.musafirwebsite.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
//	@FindBy(how=How.XPATH,using=".//input[@id='email']") WebElement txtEmail;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	@FindBy(xpath=".//a[@id='ctl00_ctrlHeader_ctrlSubNavigation_hlkLogOut']")
	WebElement logoutBtn;
	
	public void setEmail(String uemail)
	{
		txtEmail.sendKeys(uemail);
	}
	
	public void setPassword(String upassword)
	{
		txtPassword.sendKeys(upassword);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void appLogout()
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(logoutBtn).perform();
		logoutBtn.click();		
	}
	
	
	
	
	
}
