package com.tekspot.webdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void Explouser() {
		System.out.println("Internet Explouser");
	}
	@BeforeGroups(groups= {"smokeTest"})
	public void sharedFolders() {
		System.out.println("shared floders 1");
	}
	@Test(groups= {"smokeTest","RegressionTest"})
	public void groupTests() {
		System.out.println("groupd tests in our projects");
	}
	@AfterGroups(groups= {"smokeTest"})
	public void testIngroupsSmoke() {
		System.out.println("testIngroupsSmoke");
	}
	@Test(groups= {"RegressionTest"})
	public void regressionTest() {
		System.out.println("Regression test in group");
	}
	@BeforeClass
	public void driverTest() {
		System.out.println("Driver is configured");
	}
	@BeforeMethod
	public void loginfromApp() {
		System.out.println("Login in google drive");
	}
	@Test
	public void createFolder() {
		System.out.println("folder is created in google drive");
	}
	@Test
	public void sampleFolder() {
		System.out.println("folder is shsred in google drive");
	}
	@AfterMethod
	public void logOutApp() {
		System.out.println("logout from google driver");
	}
	@AfterClass
	public void driverClose() {
		System.out.println("Driver is closed");
	}
	@AfterSuite
	public void quitExplouser() {
		System.out.println("quit in Internet Explouser");
	}
	
	
}
