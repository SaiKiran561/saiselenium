package com.tekspot.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
	public WebDriver driver=null;
	@Test
	
	public void CaptureScreenShot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts =((TakesScreenshot)driver);
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfld=new File("D:\\snap.jpg");
		FileHandler.copy(srcfile, destfld);
	}

}
