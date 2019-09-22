package com.tekspot.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://www.facebook.com/");
		WebElement bdy=web.findElement(By.name("birthday_day"));
		Select sel=new Select(bdy);
		sel.selectByValue("29");
		sel.selectByVisibleText("15");
		sel.selectByIndex(31);
		sel.selectByVisibleText("9");
		
	}

}
