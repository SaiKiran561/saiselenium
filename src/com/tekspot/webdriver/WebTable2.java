package com.tekspot.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sai/Desktop/testing/table.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String val = getTableCellValue("Current Price (Rs)", "YES Bank Ltd.");
		System.out.println(val);
	}
		public static String getTableCellValue(String colName, String rowName) {
			List<WebElement> lst = driver.findElements(By.xpath("//table/thead/tr/th[text()='"+colName+"']/preceding-sibling::th"));
			int columnNo = lst.size()+1;
			
			List<WebElement> lst1 = driver.findElements(By.xpath("//tr//*[contains(text(),'"+rowName+"')]/../../preceding-sibling::tr"));
			int rowNo = lst1.size()+1;
			
			WebElement w1 = driver.findElement(By.xpath("//table/tbody/tr["+rowNo+"]/td["+columnNo+"]"));
			String val = w1.getText();
			return val;
		}



}
