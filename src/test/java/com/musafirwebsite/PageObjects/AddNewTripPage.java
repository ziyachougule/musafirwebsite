package com.musafirwebsite.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewTripPage 
{
	WebDriver ldriver;
	
	public AddNewTripPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using=".//li[@id='ctl00_ctrlHeader_ctrlSubNavigation_liTrips']")
	WebElement navTrips;
	
	@FindBy(how=How.XPATH, using=".//li[@id='ctl00_cphContent_liAddTrip']")
	WebElement addTripBtn;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_txtCustomerGivenName']")
	WebElement custFName;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_txtCustomerSurname']")
	WebElement custLName;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_txtEmail']")
	WebElement custEmail;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_txtContactNumber']")
	WebElement custMNumber;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_txtOrganization']")
	WebElement custOrgn;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ctl00_cphContent_btnSubmit']")
	WebElement CreateTrip;
	
	public void navToTripPage() 
	{
		navTrips.click();
	}
	
	public void clickonAddTrip() 
	{
		addTripBtn.click();
	}

	public void custFistName(String cfname)
	{
		custFName.sendKeys(cfname);	
	}

	public void custLastName(String clfname)
	{
		custLName.sendKeys(clfname);	
	}
	
	public void custEmailaddr(String cemailaddr) {
		custEmail.sendKeys(cemailaddr);
	}
	
	public void custMobNo(String mobnum) {
		custMNumber.sendKeys(mobnum);
	}

	public void custOrganisation(String orgnname) {
		custOrgn.sendKeys(orgnname);
	}

	public void createTrip() {
		CreateTrip.click();
	} 
	

	
	
	
}
