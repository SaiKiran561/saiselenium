package com.tekspot.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExciseScreeenShot {
	public WebDriver driver=null;
	@Test
	public void exsiseScreenShot() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertTrue("Homepage", true);
		}
	@AfterMethod
	public void tearDown(ITestResult itr) throws IOException {
		String str=getStatus(itr);
		if(str.equals("Pass"))
			{
				captureScreenShot(itr.getMethod().getMethodName());
			}
			if(str.equals("Fail"))
			{
				captureScreenShot(itr.getMethod().getMethodName());
			}
			if(str.equals("Skipped"))
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
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File sourceScreenShot = ts.getScreenshotAs(OutputType.FILE);
			File destFld = new File("D:\\java excise\\JavaDemoClass\\SeleniumWebDriver\\SCREENSHOT"+screenShotName+".jpg");
			FileHandler.copy(sourceScreenShot, destFld);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
