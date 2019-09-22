package com.tekspot.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsElements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com//mnjuser//homepage");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		String mainwin=driver.getWindowHandle();
		Set<String> subwin=driver.getWindowHandles();
//		for(String st:subwin) {
//			if(st.equals(mainwin)) {
//				driver.switchTo().window(mainwin);
//				driver.close();
//			}
	//	}
		Iterator<String> ite=subwin.iterator();
		while(ite.hasNext()){
			ite.next();
			if(ite.equals(mainwin)) {
				driver.switchTo().window(mainwin);
				driver.close();
			}
		}
	}

}
