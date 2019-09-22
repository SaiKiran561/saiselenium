package com.tekspot.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodUses {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver dri=new ChromeDriver();
	dri.get("https://www.jdwilliams.co.uk/");
	System.out.println(dri.getTitle());
	WebElement tbx=dri.findElement(By.name("searchString"));
	boolean flag=tbx.isDisplayed();
	if(flag) {
		System.out.println("Search text box is present in the Web page");
	}
	else {
		System.out.println("Search text box is not present in the Web page");
	}
	boolean flag2=tbx.isEnabled();
	if(flag2) {
		System.out.println("Search text box is enabled");
	}
	else {
		System.out.println("search text is not enabled");
	}
	String plce=tbx.getAttribute("placeholder");
	System.out.println(plce);
	String color=tbx.getCssValue("color:");
	Point p=tbx.getLocation();
	System.out.println("X Axis="+p.x);
	System.out.println("Y Axis="+p.y);
	
	Dimension d=tbx.getSize();
	System.out.println("Height:"+d.height);
	System.out.println("Width:"+d.width);
	
	String tgnm=tbx.getTagName();
	System.out.println(tgnm);
	dri.close();
}
}
