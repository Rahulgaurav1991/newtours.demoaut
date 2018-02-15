package com.newtour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	@FindBy(xpath="//a[.='REGISTER']")
	private WebElement Register;
	@FindBy(name="firstName")
	private WebElement First_name;
	@FindBy(name="lastName")
	private WebElement Last_name;
	@FindBy(name="phone")
	private WebElement Phone;
	@FindBy(id="userName")
	private WebElement Email;
	@FindBy(name="address1")
	private WebElement Address;
	@FindBy(name="city")
	private WebElement City;
	@FindBy(name="state")
	private WebElement State;
	@FindBy(name="postalCode")
	private WebElement PostalCode;
	@FindBy(name="country")
	private WebElement Country;
	@FindBy(id="email")
	private WebElement User_Name;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="confirmPassword")
	private WebElement Confirm_Password;
	@FindBy(name="register")
	private WebElement submit;
	@FindBy(xpath="//a[.=' sign-in ']/../../..//b[.=' Note: Your user name is .']")
	private WebElement Useregister;


	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void reg()
	{
		Register.click();
	}
	public void Contact_Information(String FIRST_NAME,String LAST_NAME,String PHONE,String EMAIL )
	{
		First_name.sendKeys(FIRST_NAME);
		Last_name.sendKeys(LAST_NAME);
		Phone.sendKeys(PHONE);
		Email.sendKeys(EMAIL);
		
	}
	public void  Mailing_Information(String ADDRESS,String CITY,String STATE,String POSTALCODE,String vISIBLETEXT)
	{
		Address.sendKeys(ADDRESS);
		City.sendKeys(CITY);
		State.sendKeys(STATE);
		PostalCode.sendKeys(POSTALCODE);
		Select sel=new Select(Country);
		sel.selectByVisibleText(vISIBLETEXT);
		
	}
	public void  User_Information(String USER_NAME,String PASSWORD,String CONFIRM)
	{
		User_Name.sendKeys(USER_NAME);
		Password.sendKeys(PASSWORD);
		Confirm_Password.sendKeys(CONFIRM);
		submit.submit();
		
	}
	

}
