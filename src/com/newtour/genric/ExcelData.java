package com.newtour.genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String path,String sheet,int row,int cell)
	{
		try
		  {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			return data;
			}
		catch(Exception e)
		{
			return " ";
		}
		
	}
	public int getRow(String path,String sheet)
	{
		try{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int data = wb.getSheet(sheet).getLastRowNum();
		return data;
	}
		catch(Exception e)
		{
			return 0;
		}
	}
	public short getCell(String path,String sheet,int row)
	{
		try{
			FileInputStream fis=new FileInputStream(path);
			short wb = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getLastCellNum();
			return wb;
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
