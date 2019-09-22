package com.tekspot.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngClass {
	@Test
	public void loginToApp() {
		System.out.println("log in to facebook");
	}
	@Test
	public void createFolder() {
		System.out.println("folder is created successfully");
	}
@Test
public void shareFolder() {
	System.out.println("folder is sharing");
}
@Test 
public void renameFolder() {
	System.out.println("folder name is changed successfully");
}
}
