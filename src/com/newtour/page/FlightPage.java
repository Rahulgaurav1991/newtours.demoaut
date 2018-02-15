package com.newtour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FlightPage 
{
	@FindBy(xpath="//a[.='Flights']")
	private WebElement Flight;
	@FindBy(name="userName")
	private WebElement UserName;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="login")
	private WebElement Login;
	
	@FindBy(xpath="//b[.='Passengers:']")
	private WebElement Passenger;
	
	
	
	
	
	
	
	
	public FlightPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Flight()
	{
		Flight.click();
	}
	public void Login(String USER_NAME,String PASSWORD)
	{
		UserName.sendKeys(USER_NAME);
		Password.sendKeys(PASSWORD);
		Login.click();
	}
	
	public void Flight_Details()
	{
		boolean passenger = Passenger.isDisplayed();
		try{
			Assert.assertTrue(passenger);
			Reporter.log("passenger is Displayed0",true);
		}
		catch(Exception e){
		Reporter.log("passenger is not Displayed",true);
		Assert.fail();
			
				
			
			
		}
		
	}
	
	

}
