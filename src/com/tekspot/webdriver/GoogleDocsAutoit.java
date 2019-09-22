package com.tekspot.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDocsAutoit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://drive.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean flaggd=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).isEnabled();
		if(flaggd==true) 
		{
			System.out.println("google drive is clicking");
		}
		else 
		{
			System.out.println("google drive is not clicking");
		}
		
		WebElement wle=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		wle.click();
		Thread.sleep(3000);
		
		boolean signinpg=driver.findElement(By.xpath("//div[@class='VmOpGe']")).isEnabled();
		if(signinpg==true) 
		{
			System.out.println("We are in signin page");
		}
		else 
		{
			System.out.println("we are not in sign page");
		}
		
		boolean flemailid=driver.findElement(By.id("identifierId")).isEnabled();
		if(flemailid==true) {
			System.out.println("Email or Phone check box is Enabled");
		}
		else
		{
			System.out.println("Email or Phone check box is disabled");
		}
		
	WebElement emailid=driver.findElement(By.id("identifierId"));
	emailid.sendKeys("saikiran.0493@gmail.com");
	Thread.sleep(3000);
	
	boolean nextbt=driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
	if(nextbt==true) 
	{
		System.out.println("Next button is Enabled");
	}
	else 
	{
		System.out.println("Next button s Disabled");
	}

	WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
	next.click();
	Thread.sleep(3000);
	
	boolean loginpg=driver.findElement(By.xpath("//div[@class='VmOpGe']")).isEnabled();
	if(loginpg==true)
	{
		System.out.println("We are in password page");
	}
	else
	{
		System.out.println("we are not in password page");
	}
	
	boolean pswchk=driver.findElement(By.name("password")).isEnabled();

	if(pswchk==true) 
	{
		System.out.println("password checkbox is Enabled");
	}
	else 
	{
		System.out.println("password checkbox is Disabled");
	}
	WebElement pswTxtBox = driver.findElement(By.name("password"));
	pswTxtBox.sendKeys("JAVA&SELENIUM@521");
	
	boolean flagnxtpw=driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
	if(flagnxtpw==true) 
	{
		System.out.println("Password page Next Button is Enabled");
	}
	else 
	{
		System.out.println("Password page Next Button is Disabled");
	}

	WebElement nextpw = driver.findElement(By.xpath("//span[text()='Next']"));
	nextpw.click();
	Thread.sleep(3000);
	
	boolean flagmydrivepg=driver.findElement(By.xpath("//div[@class='a-s-tb-pa a-S-x-j']")).isEnabled();
	if(flagmydrivepg==true) 
	{
		System.out.println("Now we are in my drive page");
	}
	else 
	{
		System.out.println("we are not in my drive page");
	}
	
	boolean newlb=driver.findElement(By.xpath("//div[@class='a-ec-Gd a-ec-Gd-Cs-mp-S']")).isEnabled();

	if(newlb==true) 
	{
		System.out.println("New label is Enabled");
	}
	else 
	{
		System.out.println("New label is Disabled");
	}

	WebElement newWebelm= driver.findElement(By.xpath("//div[@class='a-ec-Gd a-ec-Gd-Cs-mp-S']"));
	newWebelm.click();
	Thread.sleep(5000);
	
	boolean flgdc=driver.findElement(By.xpath("(//div[@class='h-v-x'])[4]")).isEnabled();
	if(flgdc==true) 
	{
		System.out.println("Google document is clicking");
	}
	else 
	{
		System.out.println("Google document is  not clicking");
	}
	WebElement filupl=driver.findElement(By.xpath("(//div[@class='h-v-x'])[2]"));
	Actions act=new Actions(driver);
	act.click();
	Thread.sleep(3000);
	
	fileUpload("D:\\uploadfiles\\CreateDocumentAndRename.java,D:\\uploadfiles\\CreateSheetAndRename.java,D:\\uploadfiles\\HomeWork2.java,D:\\uploadfiles\\PPTAndRename.java");

	}

	public static void fileUpload(String Open) {
		try {
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\Sai\\Desktop\\autoit\\googledocsfileUpload.exe"+" "+Open);
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
