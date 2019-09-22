package com.tekspot.webdriver;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void readMessage() {
		System.out.println("Read Message in a mail");
	}
	
	@Test
	public void fetchData() {
		System.out.println("Fetch the messages in mail");
	}
	
	@Test
	public void spiltData() {
		System.out.println("Split data in inbox");
	}
	@Test
	public void switchData() {
		System.out.println("switch data in parallel");
	}
	@AfterMethod
	public void presentFolder() {
		System.out.println("now we are promaotion folder");
	}
	@BeforeMethod
	public void shiftFolder() {
		System.out.println("now we are inbox page");
	}
	@BeforeGroups
	public void draftPage() {
		System.out.println("some messages studying in Draft page");
	}
	@AfterGroups
	public void draftPages() {
		System.out.println("messages are deleted in Draft page");
	}
	@BeforeTest()
	public void logIn() {
		System.out.println("we are in login page");
	}
	@AfterTest()
		public void logOut() {
			System.out.println("we are in log out page");
		}
	}

