package com.tekspot.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
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
		
		WebElement emailWebElm = driver.findElement(By.xpath("//input[@id='identifierId']"));
		emailWebElm.sendKeys("seleniumautomation1802@gmail.com");
		
		WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		
		Thread.sleep(3000);
		
		WebElement pswTxtBox = driver.findElement(By.name("password"));
		pswTxtBox.sendKeys("Abcd@123");
		
		WebElement next2 = driver.findElement(By.xpath("//span[text()='Next']"));
		next2.click();
		
		Thread.sleep(8000);
		
		WebElement newWebElm =  driver.findElement(By.xpath("(//div[text()='New'])[1]"));
		Actions act = new Actions(driver);
		act.click(newWebElm).perform();
		Thread.sleep(3000);
		
		WebElement fldWebElm  = driver.findElement(By.xpath("(//div[text()='Folder'])[1]"));
		act.click(fldWebElm).perform();
		Thread.sleep(2000);
		
	
		act.sendKeys("SampleFolder").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement sampleFld = driver.findElement(By.xpath("(//div[text()='SampleFolder'])[1]"));
		String actualVal = sampleFld.getText();
		if(actualVal.equals("SampleFolder"))
		{
			System.out.println("Folder is created sucessfully");
		}
		else
		{
			System.out.println("Folder is not created");
		}
		
		act.contextClick(sampleFld).perform();
		
		act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
	}

}
