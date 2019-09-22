package com.tekspot.webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchComponent {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://www.jdwilliams.co.uk/");
		WebElement txtbx=web.findElement(By.name("searchString"));
		txtbx.sendKeys("Jeans");
		WebElement schbtn=web.findElement(By.xpath("//button[@id='searchButton']"));
		schbtn.click();
		
		List<WebElement>lst=web.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		if(lst.size()>0) {
			System.out.println("we are in plp page");
		}
		else {
			System.out.println("we are not in plp page");
		}
		WebElement pppg=web.findElement(By.xpath("//p[text()='Products Per Page:']"));
		String actpl=pppg.getText();
		if(actpl.equals("PRODUCTS PER PAGE:")) {
			System.out.println("we are in plp page"+actpl);
		}
		else {
			System.out.println("we are not in plp page"+actpl);
		}
	web.close();

	}

}
