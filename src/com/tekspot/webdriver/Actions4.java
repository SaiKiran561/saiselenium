package com.tekspot.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement wle=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement destin=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Point p=destin.getLocation();
		int xaxis=p.x;
		int yaxis=p.y;
		Actions act=new Actions(driver);
		act.dragAndDrop(wle, destin).perform();
		Action act1=act.clickAndHold(wle).moveToElement(destin).release(destin).build();
	act1.perform();
	}

}
