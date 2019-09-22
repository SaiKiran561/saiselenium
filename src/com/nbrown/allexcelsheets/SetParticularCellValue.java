package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetParticularCellValue {
	public static void main(String[] args) throws IOException {
	setCellData("kiran", 6, 1, "India");
	}
	public static void setCellData(String sheetno, int rownum, int colnum, String res) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\sai.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet(sheetno);
		Row rw=sh.getRow(rownum);
		Cell cel=rw.createCell(colnum);
		cel.setCellType(CellType.STRING);
		cel.setCellValue(res);
		FileOutputStream fos=new FileOutputStream("D:\\sai.xlsx");
		wb.write(fos);
		fos.close();
		
		
		
		
	}
}
