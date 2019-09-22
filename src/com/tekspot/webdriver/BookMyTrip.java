package com.tekspot.webdriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		boolean flag=driver.findElement(By.xpath("//input[@id='fromCity']")).isEnabled();
		if(flag==true)
		{
			System.out.println("from city is Enabled");
		}
		else
		{
			System.out.println("from city is not enabled");
		}
		WebElement from=driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		boolean cityfl=driver.findElement(By.xpath("//input[@id='toCity']")).isEnabled();
		if(cityfl==true) 
		{
			System.out.println("To city is Enabled");
		}
		else
		{
			System.out.println("To city is disable");
		}
		WebElement tocity=driver.findElement(By.xpath("//input[@id='toCity']"));
		tocity.click();
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		boolean depfl=driver.findElement(By.xpath("//input[@id='departure']")).isEnabled();
		if(depfl==true) 
		{
			System.out.println("Deparature is Enabled");
		}
		else 
		{
			System.out.println("Deparature is Disabled");
		}
		WebElement depdt =driver.findElement(By.xpath("//div[@aria-label='Mon Sep 09 2019']"));
		depdt.click();
		Thread.sleep(3000);
		
/*		boolean flrt=driver.findElement(By.xpath("//input[@id='return']")).isEnabled();
if(flrt==true) {
			System.out.println("Return is Enabled ");			
		}
		else {
			System.out.println("Return is Disabled");
		}
		WebElement w4=driver.findElement(By.xpath("//span[text()='RETURN']"));
	       w4.click();
	      driver.findElement(By.xpath("//div[@aria-label='Sat Sep 14 2019']")).click();
		
		WebElement retd=driver.findElement(By.xpath("//div[@aria-label='Thu Sep 12 2019']"));
		retd.click();
	Thread.sleep(3000);*/
		boolean flagtr=driver.findElement(By.xpath("//span[text()='Travellers & CLASS']")).isEnabled();
		if(flagtr==true) 
		{
			System.out.println("Travellers & CLASS is Enabled");
			
		}
		else 
		{
			System.out.println("Travellers & CLASS is Disabled");
		}
		WebElement travel=driver.findElement(By.xpath("//span[text()='Travellers & CLASS']"));
	     travel.click();
	     WebElement adt=driver.findElement(By.xpath("//P[text()='ADULTS (12y +)']"));
	    		 adt.click();
	    		 Thread.sleep(2000);
	    		 boolean nostag=driver.findElement(By.xpath("(//li[text()='4'])[1]")).isEnabled();
	    		 if(nostag==true) 
	    		 {
	    			 System.out.println("Adults members are Enabled");
	    		 }
	    		 else 
	    		 {
	    			 System.out.println("Adults members are Disabled");
	    		 }
	       WebElement trno=driver.findElement(By.xpath("(//li[text()='4'])[1]"));
	    		   trno.click();
	       Thread.sleep(2000);
	       boolean flagappbtn=driver.findElement(By.xpath("//button[text()='APPLY']")).isEnabled();
	       if(flagappbtn==true) 
	       {
	    	   System.out.println("APPLY button is Enabled");
	       }
	       else 
	       {
	    	   System.out.println("Apply Button is not Disabled");
	       }
	       WebElement appbtn= driver.findElement(By.xpath("//button[text()='APPLY']"));
	       appbtn.click();
	       Thread.sleep(2000);
	      
	       
	      boolean search=driver.findElement(By.xpath("//a[text()='Search']")).isEnabled();
	      if(search==true) 
	      {
	    	  System.out.println("Search Button is Enabled");
	      }
	      else 
	      {
	    	  System.out.println("Search Button is Disabled");
	      }
	      
	      WebElement searchbtn= driver.findElement(By.xpath("//a[text()='Search']"));
	       searchbtn.click();
	       Thread.sleep(2000);
	       
	       boolean booknowbt=driver.findElement(By.xpath("(//button[text()='Book Now'])[2]")).isEnabled();
	       if(booknowbt==true)
	       {
	    	   System.out.println("Book Now Button is Enabled");
	       }
	       else
	       {
	    	   System.out.println("Book Now Button is Disabled");
	       }
	       WebElement booknow=driver.findElement(By.xpath("(//button[text()='Book Now'])[2]"));
	       booknow.click();
	       Thread.sleep(3000);
	       
	       String mainWinId=driver.getWindowHandle();
	       Set<String>allwindes=driver.getWindowHandles();
	       for(String winid:allwindes) {
	    	   if(!mainWinId.equals(winid)) {
	    		   driver.switchTo().window(winid);
	    		  
	    	   }
	       }
	   //    driver.switchTo().window(win2);
//	        
//	        Iterator<String> itr = allwindes.iterator();
//	        
//	        String win1 = itr.next();
//	        String win2 = itr.next();
//	        driver.switchTo().window(win2);
	        
	        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='webpush-bubble']"));

	        driver.switchTo().frame(frame1);
	        
	        boolean idtl=driver.findElement(By.xpath("//button[contains(text(),'ll do this later')]")).isEnabled();
	        if(idtl==true)
	        {
	        	System.out.println("ll do this later is Enabled");
	        }
	        else
	        {
	        	System.out.println("ll do this later is Disabled");
	        }
	        List<WebElement> lst = driver.findElements(By.xpath("//button[contains(text(),'ll do this later')]"));

	        if(lst.size()>0)
	        {
	        WebElement btnidtl=driver.findElement(By.xpath("//button[contains(text(),'ll do this later')]"));
	        		btnidtl.click();
	        }

	        driver.switchTo().defaultContent();

	        WebDriverWait wait = new WebDriverWait(driver, 60);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Continue']")));

	        boolean contbtn=driver.findElement(By.xpath("//button[text()='Continue']")).isEnabled();
	        if(contbtn==true) 
	        {
	        	System.out.println("Continue button is Enabled");
	        }
	        else 
	        {
	        	System.out.println("Continue button is Disabled");
	        }
	        WebElement contubtn=driver.findElement(By.xpath("//button[text()='Continue']"));
	        Actions act3 = new Actions(driver);
	        act3.moveToElement(contubtn).perform();
	        act3.click(contubtn).perform();
	            Thread.sleep(2000);
	        boolean flagad=driver.findElement(By.xpath("//a[text()='+ ADD ADULT']")).isEnabled();
	       if(flagad==true) {
	    	   System.out.println("+ADD ADULT is Enabled");
	       }
	       else {
	    	   System.out.println("+ADD ADULT is Disabled");
	       }
	        WebElement addadult=driver.findElement(By.xpath("//a[text()='+ ADD ADULT']"));
	        addadult.click();
	        Thread.sleep(2000);
	        boolean fistname=driver.findElement(By.xpath("//input[@placeholder='First Name']")).isEnabled();
	        if(fistname==true) {
	        	System.out.println("First Name is Enabled");
	        }
	        else {
	        	System.out.println("First Name is Disabled");
	        }
	        WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	        firstname.click();
	        firstname.sendKeys("sai");
	        Actions acti=new Actions(driver);
	        acti.sendKeys(Keys.TAB).build().perform();
	        
	        boolean flaglstname=driver.findElement(By.xpath("//input[@placeholder='Last Name']")).isEnabled();
	        if(flaglstname==true) {
	        	System.out.println("Last Name is Enabled");
	        }
	        else {
	        	System.out.println("Last Name is Disabled");
	        }
	        WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	        lastname.click();
	        lastname.sendKeys("kiran");
	        
//	        WebElement male=driver.findElement(By.xpath("(//span[@class='chooseGender-txt'])[1]"));
//	        male.click();
	}

}
