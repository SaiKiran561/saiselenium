package com.tekspot.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinksInBrowser {
@Test
public void allLinks() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jdwilliams.com/en-in/?cm_sp=JDW-Header-_-India-_-India&decoration=true");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	List<WebElement> closebt=driver.findElements(By.xpath("//span[@class='glClose']"));
	int len=closebt.size();
	for (int i = 0; i < 10; i++) 
	{
		if(len>0) 
		{
		WebElement w1=closebt.get(0);
		w1.click();
		break;
		}
		else
		{
			Thread.sleep(3000);
		}
		}
	String[] allLinks=null;
	List<WebElement> lst =driver.findElements(By.xpath("//a"));
	int len1=lst.size();
	allLinks=new String[len1];
	System.out.println(len1);
	
	for(int i=0;i<len1;i++) {
		WebElement w1=lst.get(i);
		String Link=w1.getAttribute("href");
		allLinks[i]=Link;
	}
	for(String link:allLinks) {
		System.out.println(link);
		driver.navigate().to(link);
		Thread.sleep(3000);
	
}
}
}

