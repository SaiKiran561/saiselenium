package com.tekspot.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://drive.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean flaggd=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).isEnabled();
		if(flaggd==true) {
			System.out.println("google drive is clicking");
		}
		else {
			System.out.println("google drive is not clicking");
		}
		
		WebElement wle=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		wle.click();
		Thread.sleep(3000);
		
		boolean signinpg=driver.findElement(By.xpath("//div[@class='VmOpGe']")).isEnabled();
		if(signinpg==true) {
			System.out.println("We are in signin page");
		}
		else {
			System.out.println("we are not in sign page");
		}
		
		boolean flemailid=driver.findElement(By.id("identifierId")).isEnabled();
		if(flemailid==true) {
			System.out.println("Email or Phone check box is Enabled");
		}
		else {
			System.out.println("Email or Phone check box is disabled");
		}
		
	WebElement emailid=driver.findElement(By.id("identifierId"));
	emailid.sendKeys("saikiran.0493@gmail.com");
	Thread.sleep(3000);
	
	boolean nextbt=driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
	if(nextbt==true) {
		System.out.println("Next button is Enabled");
	}
	else {
		System.out.println("Next button s Disabled");
	}

	WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
	next.click();
	Thread.sleep(3000);
	
	boolean loginpg=driver.findElement(By.xpath("//div[@class='VmOpGe']")).isEnabled();
	if(loginpg==true) {
		System.out.println("We are in password page");
	}
	else {
		System.out.println("we are not in password page");
	}
	
	boolean pswchk=driver.findElement(By.name("password")).isEnabled();

	if(pswchk==true) {
		System.out.println("password checkbox is Enabled");
	}
	else {
		System.out.println("password checkbox is Disabled");
	}
	WebElement pswTxtBox = driver.findElement(By.name("password"));
	pswTxtBox.sendKeys("JAVA&SELENIUM@521");
	
	boolean flagnxtpw=driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
	if(flagnxtpw==true) {
		System.out.println("Password page Next Button is Enabled");
	}
	else {
		System.out.println("Password page Next Button is Disabled");
	}

	WebElement nextpw = driver.findElement(By.xpath("//span[text()='Next']"));
	nextpw.click();
	Thread.sleep(3000);
	
	boolean flagmydrivepg=driver.findElement(By.xpath("//div[@class='a-s-tb-pa a-S-x-j']")).isEnabled();
	if(flagmydrivepg==true) {
		System.out.println("Now we are in my drive page");
	}
	else {
		System.out.println("we are not in my drive page");
	}
	boolean newlb=driver.findElement(By.xpath("//div[@class='a-ec-Gd a-ec-Gd-Cs-mp-S']")).isEnabled();

	if(newlb==true) {
		System.out.println("New label is Enabled");
	}
	else {
		System.out.println("New label is Disabled");
	}

	WebElement newWebelm= driver.findElement(By.xpath("//div[@class='a-ec-Gd a-ec-Gd-Cs-mp-S']"));
	newWebelm.click();
	Thread.sleep(5000);
	
	boolean flgdc=driver.findElement(By.xpath("(//div[@class='h-v-x'])[4]")).isEnabled();
	if(flgdc==true) {
		System.out.println("Google document is clicking");
	}
	else {
		System.out.println("Google document is  not clicking");
	}
	WebElement newdoc=driver.findElement(By.xpath("(//div[@class='h-v-x'])[4]"));
	Actions act=new Actions(driver);
	act.sendKeys(newdoc, Keys.ARROW_RIGHT,Keys.ENTER).build().perform();
	Thread.sleep(10000);
	
	 String mainWinId=driver.getWindowHandle();
     Set<String>allwindes=driver.getWindowHandles();
     for(String winid:allwindes) {
  	   if(!mainWinId.equals(winid)) {
  		   driver.switchTo().window(winid);
  	   }
  		  }
    
     boolean flgrename=driver.findElement(By.xpath("//input[@aria-label='Rename']")).isEnabled();
     if(flgrename==true) {
    	 System.out.println("Rename is label Enabled");
     }
     else {
    	 System.out.println("Rename is label Disabled");
     }
     
     WebElement docfile=driver.findElement(By.xpath("//input[@aria-label='Rename']"));
     docfile.click();
     docfile.clear();
   Thread.sleep(3000);
   docfile.sendKeys("  saikiran document");
   docfile.sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     
     boolean flogot=driver.findElement(By.xpath("//a[@class='gb_z gb_Ia gb_g']")).isEnabled();
     if(flogot==true) {
  	   System.out.println("going to google account to logout");
     }
     else {
  	   System.out.println("google account to logout not working");
     }
  
     WebElement lgot=driver.findElement(By.xpath("//a[@class='gb_z gb_Ia gb_g']"));
   lgot.click();
   Thread.sleep(5000);
   
   boolean sinot=driver.findElement(By.xpath("//a[@class='gb_4 gb_dg gb_lg gb_Ve gb_tb']")).isEnabled();
   if(sinot==true) {
   	System.out.println("Signout button is Enabled");
   }
   else {
   	System.out.println("Signout button is Disabled");
   }
   
   WebElement signo=driver.findElement(By.xpath("//a[@class='gb_4 gb_dg gb_lg gb_Ve gb_tb']"));
    signo.click();
    Thread.sleep(3000);
     }
	}

