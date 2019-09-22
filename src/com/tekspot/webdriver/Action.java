package com.tekspot.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.jdwilliams.co.uk/");
//		
//		Actions act=new Actions(driver);
//		WebElement newdriver=driver.findElement(By.id("topNav_Womens"));
//		act.moveToElement(newdriver).perform();
		driver.manage().window().maximize();
		driver.get("https://drive.google.com");
List<WebElement> lst = driver.findElements(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		
		if(lst.size()>=1)
		{
			System.out.println("WebElement is present");
			lst.get(0).click();
		}
		else
		{
			System.out.println("WebElement is not present");
		}
		WebElement w1=driver.findElement(By.xpath("//span[text()='Continue to Google Drive']"));
	Actions act=new Actions(driver);
	act.contextClick(w1).perform();

	}

}
