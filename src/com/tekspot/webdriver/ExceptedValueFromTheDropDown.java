package com.tekspot.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExceptedValueFromTheDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.facebook.com/");
		String exceptedvalue="Sept";
		WebElement wle=dri.findElement(By.name("birthday_month"));
		Select sel=new Select(wle);
		List<WebElement> lst=sel.getOptions();
		int len=lst.size();
		for(int i=0;i<len-1;i++) {
			WebElement w1=lst.get(i);
			String actualvalue=w1.getText();
			if(actualvalue.equals(exceptedvalue)) {
				sel.selectByVisibleText(exceptedvalue);
			}
		}

	}

}
