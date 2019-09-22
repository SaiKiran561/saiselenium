package com.tekspot.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver wbd=new ChromeDriver();
		wbd.get("file://C://Users//Sai//Desktop//tekspot1.html");
		WebElement wel =wbd.findElement(By.id("browsers"));
		Select sel=new Select(wel);
		boolean flag=sel.isMultiple();
		if(flag) {
			sel.selectByVisibleText("safari");
			sel.selectByIndex(2);
			sel.selectByValue("Internet Explouser");
		}
		//sel.deselectByVisibleText("safari");
		//sel.deselectAll();
	}

}
