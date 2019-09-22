package com.tekspot.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateRowAndColoumn {
public static void main(String[] args)throws IOException {
	
	XSSFWorkbook wb=new XSSFWorkbook();
	Sheet sh=wb.createSheet("sai1");
	Map<String, Object[]> data = new TreeMap<String, Object[]>();
	
	data.put("1", new Object[]{"Row", "Business", "Id", "Testcase", "TestKeyword"});
	data.put("2", new Object[]{101, "Us", 101,"TC01","YES"});
	data.put("4", new Object[]{209, "India",102,"TC18","NO"});
	data.put("5", new Object[]{390, "UK",103,"TC09","NO"});
	data.put("6", new Object[]{490, "Aus",104,"TC16","YES"});
	data.put("7", new Object[]{567, "Singapore",105,"TC10","NO"});
	data.put("8", new Object[]{65, "Malesiya",105,"TC06","NO"});
	data.put("9", new Object[]{73, "london",107,"TC56","NO"});
	data.put("10", new Object[]{83, "koria",108,"TC74","YES"});
	data.put("11", new Object[]{93, "germany",109,"TC13","YES"});
	data.put("12", new Object[]{103, "swis",110,"TC11","YES"});
	
	Set<String> keys = data.keySet();
	
	int rownum=0;
	for(String key: keys)
	{
		Row row = sh.createRow(rownum++);
		
		Object[] objs = data.get(key);
		
		int colnum=0;
		
		for(Object o1: objs)
		{
			Cell cell = row.createCell(colnum++);
			
			if(o1 instanceof String)
			{
				cell.setCellValue((String)o1);
			}
			else if(o1 instanceof Integer)
			{
				cell.setCellValue((Integer)o1);
			}
			
		}
	}
	FileOutputStream fos = new FileOutputStream("D:\\sai.xlsx");
	
	wb.write(fos);
	
	fos.close();
	

}
	

	}


