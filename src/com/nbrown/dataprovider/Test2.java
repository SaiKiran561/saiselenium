package com.nbrown.dataprovider;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(dataProvider="provider", dataProviderClass=A.class)
	
	public void loginToApp(String username, String password)
	{
		Reporter.log(username+","+password);
	}
	@Test(dataProvider="provider", dataProviderClass=A.class)
	public void createFolder(String folderName)
	{
		Reporter.log(folderName);
}
	
}
