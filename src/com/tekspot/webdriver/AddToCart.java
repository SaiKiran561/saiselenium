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
import org.testng.Assert;

public class AddToCart 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jdwilliams.com/en-in/?cm_sp=JDW-Header-_-India-_-India&decoration=true");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Remove UnExpected pop-up
		List<WebElement> closebt=driver.findElements(By.xpath("//span[@class='glClose']"));
		int len=closebt.size();
		for (int i = 0; i < 10; i++) 
		{
			if(len>0) 
			{
			WebElement w1=closebt.get(0);
			w1.click();
			break;
			}
			else
			{
				Thread.sleep(3000);
			}
			}
		
		String url=driver.getCurrentUrl();
		//verification Mens is available in Navigation bar or not
	boolean men=driver.findElement(By.xpath("//a[@id='topNav_Mens']")).isDisplayed();
	if(men) 
	{
		System.out.println("Mens title is displayed");
	}
	else
	{
		System.out.println("Mens title is not displayed");
	}
	WebElement mens=driver.findElement(By.xpath("//a[text()='Mens']"));
	//verification Mens link is working or not
	boolean flagmens=mens.isEnabled();
	if(flagmens)
	{
		System.out.println("Mens is Enabled");
		mens.click();
		Thread.sleep(3000);
	}
	else 
	{
		System.out.println("Mens is not Enabled");
	}
	//In Mens Iam Selected Coates and Jackets.
	boolean coats=driver.findElement(By.xpath("(//a[@data-id='singleValueFacet'])[2]")).isDisplayed();
					if(coats) 
					{
						System.out.println("Coats and Jackates are displayed");
					}
					else 
					{
						System.out.println("Coats and Jackates are  not displayed");
					}
			WebElement coatsandjacktes=driver.findElement(By.xpath("(//a[@data-id='singleValueFacet'])[2]"));
			//verification of coats and jackets
			boolean flagjackates=coatsandjacktes.isEnabled();
			if(flagjackates) 
			{
				System.out.println("coates and jackates is Enabled");
				coatsandjacktes.click();
				Thread.sleep(3000);
			}
			else 
			{
				System.out.println("coates and jackates is not Enabled");
			}
			//Here Iam Selected Double Xl. So particular WebElement is available or not
			boolean dbxl=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[1]")).isDisplayed();
			if(dbxl) 
			{
				System.out.println("Double XL is Displayed");
			}
			else 
			{
				System.out.println("Double XL is not Displayed");
			}
			
			WebElement doublexl=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[1]"));
			//verification of double checkbox is working or not
			boolean flagdoublexl=doublexl.isEnabled();
			if(flagdoublexl)
			{
				System.out.println("Double Xl is Enabled");
				doublexl.click();
				Thread.sleep(3000);
			}
			else 
			{
				System.out.println("Double Xl is Not Enabled");
			}
			//here iam selected Blue color jocket.
			boolean blue=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[25]")).isDisplayed();
			if(blue)
			{
				System.out.println("Blue Color Jackets are Displayed");
			}
			else 
			{
				System.out.println("Blue Color Jackets are Not Displayed");
			}
			WebElement bluecolor=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[25]"));
			//verification blue color is selected or not
			boolean flagblue=bluecolor.isEnabled();
			if(flagblue) 
			{
				System.out.println("Blue Colour is Enabled");
				bluecolor.click();
				Thread.sleep(3000);
			}
			else 
			{
				System.out.println("Blue Colour is Not Enabled");
			}
			//here iam selected jacamo brand
			boolean jacamo=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[28]")).isDisplayed();
			if(jacamo) 
			{
				System.out.println("Jacamo Brand is Displayed");
			}
			else 
			{
				System.out.println("Jacamo Brand is Not Displayed");
			}
			WebElement jacamobrand=driver.findElement(By.xpath("(//label[@class='js-facet-selection'])[28]"));
			//verification jacamo brand link is working or not
			boolean flagjacamo=jacamobrand.isEnabled();
			if(flagjacamo) 
			{
				System.out.println("Jacamo Brand is Enabled");
				jacamobrand.click();
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Jacamo Brand is not Enabled");
			}
			//here iam selected one product
			boolean jocket=driver.findElement(By.xpath("//p[@title='view Capsule Padded Jacket']")).isDisplayed();
			if(jocket) 
			{
				System.out.println("Capsule Padded Jacket is Displayed");
			}
			else 
			{
				System.out.println("Capsule Padded Jacket is not Displayed");
			}
		WebElement capsulejocket=driver.findElement(By.xpath("//p[@title='view Capsule Padded Jacket']"));
		boolean flagcapsulejocket=capsulejocket.isEnabled();
		if(flagcapsulejocket) 
		{
			System.out.println("Capsule Padded Jacket is Enabled");
			capsulejocket.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("Capsule Padded Jacket is Not Enabled");
		}
		//here selected your size. Iam selected 2xl 52/54 size
	boolean size=driver.findElement(By.xpath("//button[@id='standard-AU498-variantselector-size-2XL5254']")).isDisplayed();	
		if(size) 
		{
			System.out.println("Select Your size(in uk sizes) 2XL 52/54 is Displayed");
		}
		else 
		{
			System.out.println("Select Your size(in uk sizes) 2XL 52/54 is Not Displayed");
		}
		WebElement sizeinuk=driver.findElement(By.xpath("//button[@id='standard-AU498-variantselector-size-2XL5254']"));
		
		boolean flagsize=sizeinuk.isEnabled();
		if(flagsize) 
		{
			System.out.println("Select Your size(in uk sizes) 2XL 52/54 is Enabled");
			sizeinuk.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("Select Your size(in uk sizes) 2XL 52/54 is Not Enabled");
		}
		//verification part of the plus button 
		boolean addbt=driver.findElement(By.xpath("//button[@class='btn standard-AU498-btn-number btn-count btn-count-plus']")).isDisplayed();
		if(addbt) 
		{
			System.out.println("plus button is displayed");
		}
		else 
		{
			System.out.println("plus button is not displayed");
		}
		WebElement plusbutton=driver.findElement(By.xpath("//button[@class='btn standard-AU498-btn-number btn-count btn-count-plus']"));
		
		boolean flagplusbt=plusbutton.isEnabled();
		if(flagplusbt) 
		{
			System.out.println("Plus Button Is Enabled");
			plusbutton.click();
			Thread.sleep(3000);
			}
		else 
		{
			System.out.println("Plus Button Is Not Enabled");
		}
		//verification part of add to cart
		boolean addtocrt=driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).isDisplayed();
		if(addtocrt)
		{
			System.out.println("Add To Cart is Displayed");
		}
		else 
		{
			System.out.println("Add To Cart is Not Displayed");
		}
		WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-button']"));
		
		boolean flagaddtocart=addtocart.isEnabled();
		if(flagaddtocart) 
		{
			System.out.println("ADD-TO-CART Is Enabled");
			addtocart.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("ADD-TO-CART Is Not Enabled");
		}
		//verification part of continue to check out 
		boolean chkout=driver.findElement(By.xpath("//a[@class='btn btn-ui-primary btn-md btn-go-to-checkout']")).isDisplayed();
		if(chkout)
		{
			System.out.println("Continue To Check Out is Displayed");
		}
		else 
		{
			System.out.println("Continue To Check Out is Not Displayed");
		}
		WebElement continuetocheckout=driver.findElement(By.xpath("//a[@class='btn btn-ui-primary btn-md btn-go-to-checkout']"));
		boolean flagcontinuetocheckout=continuetocheckout.isEnabled();
		if(flagcontinuetocheckout) 
		{
			System.out.println("Continue To Check Out is Enabled(or) Successfully Add in Bag");
			continuetocheckout.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("Continue To Check Out is Disabled(or) Items are not Added in Bag");
		}
		//verification part of another checkout
		boolean checkot=driver.findElement(By.xpath("//button[@id='GoToCheckoutBOTTOM']")).isDisplayed();
		if(checkot)
		{
			System.out.println("GoTo CheckOut is Displayed");
		}
		else
		{
			System.out.println("GoTo CheckOut is Not Displayed");
		}
		WebElement gotocheckout=driver.findElement(By.xpath("//button[@id='GoToCheckoutBOTTOM']"));
		boolean flaggotocheckout=gotocheckout.isEnabled();
		if(flaggotocheckout) 
		{
			System.out.println("GoTo CheckOut is Enabled");
			gotocheckout.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("GoTo CheckOut is  Not Enabled");
		}
		//verification email address check box
		boolean emailaddress=driver.findElement(By.xpath("//input[@class='form-control']")).isDisplayed();
		if(emailaddress) 
		{
			System.out.println("Enter Email address box is Displayed");
		}
		else 
		{
			System.out.println("Enter Email address box is Not Displayed");
		}
		WebElement emailaddr=driver.findElement(By.xpath("//input[@class='form-control']"));
		boolean flagemailaddress=emailaddr.isEnabled();
		if(flagemailaddress)
		{
			System.out.println("Enter Email address box is Enabled");
			emailaddr.click();
			emailaddr.sendKeys("kiranrebel.142@gmail.com");
			}
		else 
		{
			System.out.println("Enter Email address box is Not Enabled");
		}
		//verification part of continue button
		boolean cont=driver.findElement(By.xpath("//button[@id='btnSignInLanding']")).isDisplayed();
		if(cont)
		{
			System.out.println("Continue Button is Displayed");
		}
		else 
		{
			System.out.println("Continue Button is not Displayed");
		}
		
		WebElement continbt=driver.findElement(By.xpath("//button[@id='btnSignInLanding']"));
		boolean flagconitbt=continbt.isEnabled();
		if(flagconitbt)
		{
			System.out.println("Continue Button is Enabled");
			continbt.click();
			Thread.sleep(3000);
		}
		else 
		{
			System.out.println("Continue Button is Not Enabled");
		}
		
		System.out.println("Task Item Add-in Bag is Successfuuly Completed");
}
}



//button[@id='mn_email_popup_close']

//div[@class='closeBtn']
