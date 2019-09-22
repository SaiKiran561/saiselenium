package com.tekspot.webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
@Test
public void testCase1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://books.goalkicker.com/");
	driver.manage().window().maximize();

driver.close();
}
@Test
public void testCase2() {
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	WebDriver firefoxdr=new FirefoxDriver();
	 firefoxdr.manage().window().maximize();
	 firefoxdr.get("https://www.jdwilliams.co.uk/");
	 firefoxdr.close();
	 
}
}
