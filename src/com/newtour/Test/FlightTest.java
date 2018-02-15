package com.newtour.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.newtour.genric.BaseTest;
import com.newtour.genric.ExcelData;
import com.newtour.page.FlightPage;

public class FlightTest extends BaseTest
{
	@Test
	public void vallid_Flight()
	{
		String USER_NAME=ExcelData.getData(path,"FlightSheet",1,0);
		String PASSWORD=ExcelData.getData(path,"FlightSheet",1,1);
		FlightPage fp=new FlightPage(driver);
		fp.Flight();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		fp.Login(USER_NAME, PASSWORD);
		fp.Flight_Details();
				
	}

}
