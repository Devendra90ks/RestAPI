package com.qa.Read_WriteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		File src =new File("/home/claritus/eclipse-workspace/Automation1/src/com/qa/Read_WriteData/TestData.xlsx");
		
		FileInputStream fis =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh= wb.getSheetAt(0);
		
		String cellValues = sh.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(cellValues);
		
		
		
		
		
		
		

	}

}
