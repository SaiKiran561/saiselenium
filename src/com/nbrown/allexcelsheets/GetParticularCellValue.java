package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetParticularCellValue {

	public static void main(String[] args) throws IOException {
getCellData("Kiran",6,2);
	}

	public static void getCellData(String sheetno, int rownum, int colnum) throws IOException {
		FileInputStream fis=new FileInputStream("D://sai.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("kiran");
		Row rw=sh.getRow(rownum);
		Cell cel=rw.getCell(colnum);
		CellType celtype=cel.getCellType();
		switch(celtype) {
		case STRING:
			System.out.println(cel.getStringCellValue());
			break;
		case NUMERIC:
			System.out.println(cel.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.println(cel.getBooleanCellValue());
		}
	}

}
