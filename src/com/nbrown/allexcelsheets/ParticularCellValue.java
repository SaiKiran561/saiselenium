package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ParticularCellValue {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D://sai.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	Sheet sh=wb.getSheet("kiran");
	int rowlen=sh.getLastRowNum();
	for(int i=0;i<rowlen-1;i++) {
		Row rw=sh.getRow(i);
		Cell cel=rw.getCell(4);
		CellType ctype=cel.getCellType();
		
		switch(ctype) {
		case STRING:
			System.out.println(cel.getStringCellValue());
			break;
		case NUMERIC:
			System.out.println(cel.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.println(cel.getBooleanCellValue());
			break;
		}
	}
}

	
}
