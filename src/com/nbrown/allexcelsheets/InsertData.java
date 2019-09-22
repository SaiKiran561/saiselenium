package com.nbrown.allexcelsheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class InsertData {
	@Test
	public void insertDtat() throws IOException {
		FileInputStream fis=new FileInputStream("D:\\sai.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.createSheet("kiran");
		Map<String,Object[]> lhm=new LinkedHashMap<String,Object[]>();
		lhm.put("1", new Object[] {"Row","Business Country","Id", "TestCase","TestKeyword"});
		lhm.put("2", new Object[] {1,"India","Ind-01", "TC01","YES"});
		lhm.put("3", new Object[] {2,"Usa","Usa-01", "TC02","No"});
		lhm.put("4", new Object[] {3,"Uk","Uk-01", "TC03","YES"});
		lhm.put("5", new Object[] {4,"Singapore","Sin-01", "TC04","No"});
		lhm.put("6", new Object[] {5,"India","Ind-01", "TC05","No"});
		lhm.put("7", new Object[] {6,"Germany","Ger-01", "TC06","No"});
		lhm.put("8", new Object[] {7,"Australia","Aus-01", "TC07","YES"});
		lhm.put("9", new Object[] {8,"Malasia","Mal-01", "TC08","YES"});
		lhm.put("10", new Object[] {9,"Canada","Can-01", "TC09","YES"});
		lhm.put("11", new Object[] {10,"Usa","Us-02", "TC10","No"});
		Set<String>Keys=lhm.keySet();
		int rownum=0;
		for(String key:Keys) {
			Row rw=sh.createRow(rownum++);
		Object[] objs=lhm.get(key);
		int colnum=0;
		for(Object o1:objs) {
			Cell cel=rw.createCell(colnum++);
			if(o1 instanceof String) {
				cel.setCellValue((String) o1);
			}
			if(o1 instanceof Integer) {
				cel.setCellValue((Integer) o1);
			}
			
		}
		}
	FileOutputStream fos=new FileOutputStream("D:\\sai.xlsx");
	wb.write(fos);
	fos.close();
	}
}
