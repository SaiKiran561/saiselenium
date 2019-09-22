package com.tekspot.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDisplayPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver wbd=new ChromeDriver();
		wbd.get("https://www.jdwilliams.co.uk/");
		wbd.manage().window().maximize();
		WebElement wen=wbd.findElement(By.name("searchString"));
		wen.sendKeys("trousers");
		WebElement scb=wbd.findElement(By.xpath("//button[@id='searchButton']"));
		scb.click();
		String pgs=wbd.getPageSource();
		if(pgs.contains("BB481")) {
			System.out.println("The product is present");
		}
		else {
			System.out.println("The product is not present");
		}
		WebElement plpim=wbd.findElement(By.xpath("(//img[contains(@id,'image')])[1]"));
		plpim.click();
		String url=wbd.getCurrentUrl();
		System.out.println(url);
		String productId="DA017";
		if(url.contains(productId.toLowerCase()))
		{
		System.out.println("The product id is present in the url");
		}
		else
		{
		System.out.println("The product id is not present in the url");
		}
			wbd.navigate().to("https://www.flipkart.com/");
			String curl=wbd.getCurrentUrl();
			System.out.println(curl);
			wbd.navigate().back();
			String jdurl=wbd.getCurrentUrl();
			System.out.println(jdurl);
			wbd.navigate().forward();
			String simpl=wbd.getCurrentUrl();
			System.out.println(simpl);
			wbd.navigate().refresh();
			wbd.quit();

	}

	

}
