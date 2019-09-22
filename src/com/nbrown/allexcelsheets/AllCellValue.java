package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllCellValue {

	public static void main(String[] args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value");
//		
//		String name = sc.next();
		setData("sai1", 3, 2, "germany");
	}
		public static void setData(String sheetName, int rowNum, int colNum, String res)throws Exception{

		FileInputStream fis = new FileInputStream("D:\\sai.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		Cell cell = row.createCell(colNum);
		
		cell.setCellType(CellType.STRING);
		
		cell.setCellValue(res);
		
		// Open the excel sheet in the write mode
		FileOutputStream fos = new FileOutputStream("D:\\sai.xlsx");
		
		wb.write(fos);
		
		fos.close();
		
		System.out.println("Success");
		
		}
}
