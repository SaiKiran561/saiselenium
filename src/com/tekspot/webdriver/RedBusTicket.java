package com.tekspot.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTicket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement onward=driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]"));
		onward.click();
	}

}
