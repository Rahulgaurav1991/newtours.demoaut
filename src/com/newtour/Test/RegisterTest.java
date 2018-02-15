package com.newtour.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.newtour.genric.BaseTest;
import com.newtour.genric.ExcelData;
import com.newtour.page.RegisterPage;
@Listeners(com.newtour.genric.Listners.class)
public class RegisterTest extends BaseTest
{
	@Test
	public void check_Register()
	{
		String FIRST_NAME=ExcelData.getData(path,"Register",1,0);
		String LAST_NAME=ExcelData.getData(path,"Register", 1,1);
		String PHONE=ExcelData.getData(path,"Register",1,2);
		String EMAIL=ExcelData.getData(path,"Register",1,3);
		String ADDRESS=ExcelData.getData(path,"Register",1,4);
		String CITY=ExcelData.getData(path,"Register",1,5);
		String STATE=ExcelData.getData(path,"Register",1,6);
		String POSTALCODE=ExcelData.getData(path,"Register",1,7);
		String VISIBLETEXT=ExcelData.getData(path,"Register", 1,8);
		String USER_NAME=ExcelData.getData(path,"Register",1,9);
		String PASSWORD=ExcelData.getData(path,"Register",1,10);
		String CONFIRM=ExcelData.getData(path,"Register",1,11);
		
		
		RegisterPage rp=new RegisterPage(driver);
		rp.reg();
		rp.Contact_Information(FIRST_NAME, LAST_NAME, PHONE, EMAIL);
		rp.Mailing_Information(ADDRESS, CITY, STATE, POSTALCODE, VISIBLETEXT);
		rp.User_Information(USER_NAME, PASSWORD, CONFIRM);
		

		
	}

}
