package com.tekspot.webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiExpectedValueFromTheDropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver wbd=new ChromeDriver();
	wbd.get("file://C://Users//Sai//Desktop//tekspot1.html");
	String []exceptedvalue= {"Firefox","Chrome","Opera"};
	WebElement wel =wbd.findElement(By.id("browsers"));
	Select sel=new Select(wel);
	List<WebElement> alloptions=sel.getOptions();
	boolean flag=sel.isMultiple();
	if(flag) {
		for(String value:exceptedvalue) {
			Iterator<WebElement> itr=alloptions.iterator();
			while(itr.hasNext()) {
				WebElement w1=itr.next();
				String actval=w1.getText();
				if(actval.equals(value)) {
					sel.selectByVisibleText(value);
					break;
				}
			}
		}
	}
	List<WebElement> allselval=sel.getAllSelectedOptions();
	for(WebElement we:allselval) {
		String actualvalue=we.getText();
		for(String s:exceptedvalue) {
			if(actualvalue.equals(s)) {
				System.out.println("yes "+s);
			}
//			else {
//				System.out.println("No "+s);
//			}
			
		}
	}
	WebElement wbn=sel.getFirstSelectedOption();
	System.out.println(wbn.getText());
	}

}
