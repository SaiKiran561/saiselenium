package com.tekspot.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDrive {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://drive.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement wle=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
			wle.click();
			Thread.sleep(3000);
		WebElement emailid=driver.findElement(By.id("identifierId"));
		emailid.sendKeys("saikiran.0493@gmail.com");
		Thread.sleep(3000);
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(3000);
		WebElement pswTxtBox = driver.findElement(By.name("password"));
		pswTxtBox.sendKeys("JAVA&SELENIUM@521");
		
		WebElement next2 = driver.findElement(By.xpath("//span[text()='Next']"));
		next2.click();
		Thread.sleep(3000);
		
		WebElement Fldavialable=driver.findElement(By.xpath("//div[contains(@class,'bSmy5')]"));

		Actions act=new Actions(driver);

		act.contextClick(Fldavialable).perform();

		Thread.sleep(5000);

		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();

		Thread.sleep(5000);		

		

		//Click on new

		WebElement New=driver.findElement(By.xpath("//div[contains(@class,'a-ec-Gd a-ec-Gd-Cs-mp-S')]"));

		New.click();

		Thread.sleep(5000);

		

		//Go to folder

		WebElement Fld=driver.findElement(By.xpath("//div[contains(@class,'a-v-T')]"));

		Fld.click();

		Thread.sleep(5000);

		

		//Click on Editbox and create new folder

		WebElement editbox=driver.findElement(By.xpath("//input[@class='lb-k-Kk g-Gh']"));

		editbox.sendKeys("Mogembo");

		WebElement Btn=driver.findElement(By.xpath("//button[@name='ok']"));

		Btn.click();

		Thread.sleep(5000);

		

		//Verification and deletion

		WebElement Folder=driver.findElement(By.xpath("//div[contains(@class,'bSmy5')]"));

		String actualVal = Folder.getText();

	      	if(actualVal.equals("Mogembo"))

	      	{

	      		System.out.println("folder created successfully");

	      

	      		WebElement Dfld=driver.findElement(By.xpath("//div[@aria-label='Mogembo Google Drive Folder']"));

	      		act.contextClick(Dfld).perform();

	      		Thread.sleep(5000);

	      		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();

	      	}

	      	else

	      	{

	    	  		System.out.println("foler not created");

	      	}

	}

}
