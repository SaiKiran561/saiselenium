package com.nbrown.core.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nbrown.core.framework.utilites.Global;

public class Driver {
public static WebDriver driver=null;
public static WebDriver getDriver() {
	try {
		String browser=Global.browser;
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Global.chromeServer);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.geckodriver.driver", Global.FFServer);
			driver=new FirefoxDriver();
			break;
		default:
			throw new Exception("Invalid Exception");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
} 
}
