package com.tekspot.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShareFolder {

	@Test
	public void shareFolder() throws InterruptedException{
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
	WebElement newlbl=driver.findElement(By.xpath("//div[text()='New']/.."));
	newlbl.click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	WebElement createfolder=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	createfolder.clear();
	Thread.sleep(3000);
	createfolder.sendKeys("SaiKiran Folder");
	Thread.sleep(3000);
	WebElement create=driver.findElement(By.xpath("//button[text()='Create']"));
	create.click();
	Thread.sleep(3000);
	WebElement saifolder=driver.findElement(By.xpath("//div[@aria-label='SaiKiran Folder Google Drive Folder'][1]"));
	String actval=saifolder.getText();
	if(actval.equals("SaiKiran Folder")) {
		System.out.println("folder is present in drive");
		saifolder.click();
		Thread.sleep(6000);
		WebElement shareBtn = driver.findElement(By.xpath("(//div[@aria-label='Remove']//preceding-sibling::div)[2]"));
				shareBtn.click();
				WebElement frameWebElm = driver.findElement(By.xpath("//iframe[@title='Share with others']"));
				driver.switchTo().frame(frameWebElm);
				WebElement advWebElm = driver.findElement(By.xpath("//span[text()='Advanced']"));
				advWebElm.click();
				}
	else {

System.out.println("Folder not present in drive");
	}
	}
	
}
