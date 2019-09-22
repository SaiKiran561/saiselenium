package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllRowValues {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("D:\\sai.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
Sheet sh=wb.getSheet("sai1");
Row rw=sh.getRow(2);
Iterator<Cell> celitr=rw.cellIterator();
while(celitr.hasNext()) {
	Cell cel=celitr.next();
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
		break;
	}
}
	}

	

}
