package com.tekspot.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShot3 {
	WebDriver driver=null;
@Test
public void screenShot() throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.jdwilliams.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	captureScreenShot("HomePage");
	driver.findElement(By.xpath("//input[@id='searchKeyWords2']")).sendKeys("jeans");
	driver.findElement(By.xpath("//button[@id='searchButton']")).click();
	WebDriverWait wait=new WebDriverWait(driver,120);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Petite Erin Pull-On Bootcut Jeggings']")));
	captureScreenShot("PLP");
}
@Test
public void faceBookScreenShot() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
@AfterMethod
public void tearDown1(ITestResult itr) throws IOException
{	
	if(itr.SUCCESS==1)
	{
		captureScreenShot(itr.getMethod().getMethodName());
	}
	else if(itr.FAILURE==2)
	{
		captureScreenShot(itr.getMethod().getMethodName());
	}
	else if(itr.SKIP==3)
	{
		captureScreenShot(itr.getMethod().getMethodName());
	}
}

public String getStatus(ITestResult itr)
{
	int statusVal = itr.getStatus();
	
	switch(statusVal)
	{
		case 1:
			return "Pass";
		case 2:
			return "Fail";
		case 3:
			return "Skipped";
	}
	return "Not Completed";
}



public void captureScreenShot(String screenShotName) throws IOException
{
	TakesScreenshot ts = ((TakesScreenshot)driver);
	File sourceScreenShot = ts.getScreenshotAs(OutputType.FILE);
	File destFld = new File("D:\\sai"+screenShotName+".jpg");
	FileHandler.copy(sourceScreenShot, destFld);
}
}
