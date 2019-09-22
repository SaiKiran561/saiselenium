package com.tekspot.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot2 {
@Test
	public void screenShot2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://drive.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement googledrive=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		googledrive.click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		WebElement username=driver.findElement(By.xpath("//input[@name='identifier']"));
		username.click();
		username.sendKeys("saikiran.0493@gmail.com");
		Thread.sleep(3000);
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(3000);
		String url3=driver.getCurrentUrl();
		System.out.println(url3);
		WebElement password=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		password.click();
		password.sendKeys("JAVA&SELENIUM@521");
		Thread.sleep(3000);
		WebElement pswnext=driver.findElement(By.xpath("//span[text()='Next']"));
		pswnext.click();
	Thread.sleep(3000);
	String url4=driver.getCurrentUrl();
	System.out.println(url4);
		
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
