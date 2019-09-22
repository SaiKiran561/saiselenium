package com.tekspot.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Course2 {
	@AfterClass
	public void afterClass() {
		System.out.println("It will be executed after all test cases........");
	}
	@Test
	public void testing1() {
		System.out.println("Manual");
	}
	@Test
	public void testing2() {
		System.out.println("Selenium");
	}
	@Test
	public void testing3() {
		System.out.println("Automation");
	}
}
