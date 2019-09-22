package com.nbrown.dataprovider;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Test cases is started:");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log(result.getMethod().getMethodName()+"Test cases is success:");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	Reporter.log(result.getMethod().getMethodName()+"Test cases is failure:");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Test cases is skipped:");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Test cases is failed with 50 percentage:");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Test cases is failed 50sec timeout:");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"Test case is getting start");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"Test case is getting finish");
	}

}
