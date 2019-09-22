package com.tekspot.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver dir=new ChromeDriver();
		dir.get("https://www.jdwilliams.co.uk/");
		WebElement wet=dir.findElement(By.name("searchString"));
		wet.sendKeys("T-Shirts");
		
		WebElement sbf=dir.findElement(By.xpath("//button[@id='searchButton']"));
		sbf.click();
		List<WebElement> lst=dir.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		if(lst.size()>0) {
			System.out.println("we are in plp page in T-shirts");
		}
		else {
			System.out.println("we are not in plp page in T-shirts");
		}
		System.out.println("Available T-shirts in plp page:"+lst.size());
		
		
		WebElement wet1=dir.findElement(By.name("searchString"));
		wet1.sendKeys("Bedding Sets");
		WebElement sbf1=dir.findElement(By.xpath("//button[@id='searchButton']"));
		sbf1.click();
		List<WebElement> lst1=dir.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		if(lst1.size()>0) {
			System.out.println("we are in plp page in Bedding Sets");
		}
		else {
			System.out.println("we are not in plp page Bedding Sets");
		}
		System.out.println("Available Bedding Sets in plp page:"+lst1.size());
		
		WebElement wet2=dir.findElement(By.name("searchString"));
		wet2.sendKeys("Books");
		WebElement sbf2=dir.findElement(By.xpath("//button[@id='searchButton']"));
		sbf2.click();
		List<WebElement> lst2=dir.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		if(lst2.size()>0) {
			System.out.println("we are in plp page in Books");
		}
		else {
			System.out.println("we are not in plp page Books");
		}
		System.out.println("Available Books in plp page:"+lst2.size());
		
		
	}

}
