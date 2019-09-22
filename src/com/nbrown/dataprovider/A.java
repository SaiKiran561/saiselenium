package com.nbrown.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test(dataProvider="provider")
	public void loginToApp(String username, String password)
	{
		System.out.println(username+" , "+password);
	}

	@DataProvider(name="provider")
public static Object[][] getData(Method m)
{
	Object[][] o1 = null;
	
	if(m.getName().equals("loginToApp"))
	{
		o1 = new Object[3][2];
		
		o1[0][0] = "AB";
		o1[0][1] = "01";
		
		o1[1][0] = "BC";
		o1[1][1] = "02";
		
		o1[2][0] = "CD";
		o1[2][1] = "03";
	}
	else if(m.getName().equals("createFolder"))
	{
		o1 = new Object[2][1];
		
		o1[0][0] = "SampleFolder";
		
		o1[1][0] = "sai";
	}
			
	return o1;
}

}
