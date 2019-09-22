package com.tekspot.practice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite3 {
@Test
public void goldLoan() {
	System.out.println("gold loan...........");
}
@BeforeSuite
public void beforeMethod() {
	System.out.println("before all suiteeeeee.....");
}
}
