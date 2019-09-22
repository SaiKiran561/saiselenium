package com.tekspot.webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.testng.annotations.Test;

public class ReadonlyNoData {
	@Test
	public  void yesData() throws IOException {
FileInputStream fis = new FileInputStream("D:\\sai.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("sai1");
		

		Iterator<Row> rowItr = sheet.iterator();
		
		while(rowItr.hasNext())
		{
			
			Row row = rowItr.next();
			
			Cell cell = row.getCell(4);
			
			
				CellType cType = cell.getCellType();
			
			
			
			switch(cType)
			{
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
			}
		}
	}
}



