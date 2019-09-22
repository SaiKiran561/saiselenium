package com.tekspot.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekspot1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sai/Desktop/testing/upload.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		WebElement uploadBtn= driver.findElement(By.xpath("//input[@name='file']"));
		uploadBtn.click();
		Thread.sleep(3000);
		
		
		fileUpload("C:\\Users\\Sai\\Desktop\\tekspot1.html");

	}

	public static void fileUpload(String string) {
		try {
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\Sai\\Desktop\\autoit.exe"+" "+string);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
