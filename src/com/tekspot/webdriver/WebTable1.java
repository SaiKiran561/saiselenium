package com.tekspot.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sai/Desktop/testing/table.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement bhp =driver.findElement(By.xpath("//*[contains(text(),'Bharat Petroleum')]"));
		System.out.println(bhp.getText());
		List<WebElement> rwcount =driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total row in Table: "+rwcount.size());
		List<WebElement> colcount=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Total coloumns in Table: "+colcount.size());
	WebElement ptcell=driver.findElement(By.xpath("//table/tbody/tr[20]/td[4]"));
	System.out.println(ptcell.getText());
	}
 
}
