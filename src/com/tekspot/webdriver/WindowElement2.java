package com.tekspot.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowElement2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.naukri.com");
		drive.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement elem=drive.findElement(By.xpath("(//a[@title='Search Jobs'])[1]"));
		elem.click();
		String expectedTitle = " Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com ";
		String mainwinid=drive.getWindowHandle();
		Set<String> allwinid=drive.getWindowHandles();
		for(String s1:allwinid) {
			drive.switchTo().window(mainwinid);
			String actualTitle = drive.getTitle();
			if(actualTitle.equals(expectedTitle)) {
				drive.findElement(By.xpath("(//a[@title='All Jobs'])[1]")).click();
				drive.close();
			}
		}
		drive.switchTo().window(mainwinid);
	}

}
