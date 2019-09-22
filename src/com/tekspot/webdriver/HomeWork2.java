package com.tekspot.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeWork2 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://drive.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	boolean flaggd=driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).isEnabled();
	if(flaggd==true) 
	{
		System.out.println("google drive is open another page");
	}
	else
	{
		System.out.println("google drive is not open another page");
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
	if(flemailid==true)
	{
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
	System.out.println("We are in login page");
}
else
{
	System.out.println("we are not in login page");
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

boolean nextflg=driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
if(nextflg==true) 
{
	System.out.println("Next Button in password page is Enabled");
}
else
{
	System.out.println("Next Button in password page is Disabled");
}
WebElement next2 = driver.findElement(By.xpath("//span[text()='Next']"));
next2.click();
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
/*WebElement fldr=driver.findElement(By.xpath("(//div[@aria-label='sai folder Google Drive Folder'])[2]"));

Actions act= new Actions(driver);
act.contextClick(fldr);
Thread.sleep(3000);
act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
Thread.sleep(3000);*/

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

boolean flgnewfld=driver.findElement(By.xpath("(//div[@class='h-v-x'])[1]")).isEnabled();

if(flgnewfld==true) 
{
	System.out.println("New Folder is clickling");
}
else 
{
	System.out.println("New Folder is not clickling");
}

WebElement newfld=driver.findElement(By.xpath("(//div[@class='h-v-x'])[1]"));
newfld.click();
Thread.sleep(3000);

boolean flgsamfld=driver.findElement(By.xpath("//input[@class='lb-k-Kk g-Gh']")).isEnabled();
if(flgsamfld==true) 
{
	System.out.println("Sample Folder check box is Enabled");
}
else 
{
	System.out.println("Sample Folder check box is disabled");
}

WebElement samfld=driver.findElement(By.xpath("//input[@class='lb-k-Kk g-Gh']"));
samfld.sendKeys("saikiran folder");
Thread.sleep(3000);

boolean flagcreate=driver.findElement(By.xpath("//button[@class='h-De-Vb h-De-Y']")).isEnabled();
if(flagcreate==true)
{
	System.out.println("Create button is Enabled");
}
else 
{
	System.out.println("Create button is Disabled");
}
WebElement create=driver.findElement(By.xpath("//button[@class='h-De-Vb h-De-Y']"));
create.click();
Thread.sleep(3000);

boolean saifldr=driver.findElement(By.xpath("(//div[@aria-label='saikiran folder Google Drive Folder'])[1]")).isEnabled();
if(saifldr==true) 
{
	System.out.println("Sai folder is available in present page");
}
else 
{
	System.out.println("Sai folder is not available in present page");
}
WebElement delfol=driver.findElement(By.xpath("(//div[@aria-label='saikiran folder Google Drive Folder'])[1]"));

Actions act= new Actions(driver);
act.contextClick(delfol);
Thread.sleep(3000);
act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();

boolean flogot=driver.findElement(By.xpath("//a[@class='gb_z gb_Ia gb_g']")).isEnabled();
if(flogot==true) 
{
	   System.out.println("going to google account to logout");
}
else 
{
	   System.out.println("google account to logout not working");
}

WebElement lgot=driver.findElement(By.xpath("//a[@class='gb_z gb_Ia gb_g']"));
lgot.click();
Thread.sleep(5000);

boolean sinot=driver.findElement(By.xpath("//a[@class='gb_4 gb_dg gb_lg gb_Ve gb_tb']")).isEnabled();
if(sinot==true) 
{
	System.out.println("Signout button is Enabled");
}
else 
{
	System.out.println("Signout button is Disabled");
}

WebElement signo=driver.findElement(By.xpath("//a[@class='gb_4 gb_dg gb_lg gb_Ve gb_tb']"));
signo.click();
Thread.sleep(3000);

	
	}
}
