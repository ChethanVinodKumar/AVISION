package com.ExtentReport;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsAvision {
	public ExtentReports reports;
	public ExtentSparkReporter htmlReporter;
	public ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		
		htmlReporter = new ExtentSparkReporter("extentreport Demo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environment details
		reports.setSystemInfo("Machine", "Testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("user", "Gopal");
		reports.setSystemInfo("Browser", "Chrome");
		
		//Configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report for SA_FG Flow");
		htmlReporter.config().setReportName("TEST AVision");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	}
	
	@Test
	public void lunchBrowser() {
		test = reports.createTest("Verify Title");
		Assert.assertTrue(true);
		System.out.println("GOPal");
	}
	
	@Test
	public void lunchBrowser1() {
		ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(consoleOutput);
	    PrintStream originalOut = System.out;
	    PrintStream originalErr = System.err;
	    System.setOut(ps);
	    System.setErr(ps);
		test = reports.createTest("Verify Title");
		System.out.println("Console OutPut test");
		Assert.assertTrue(false);
		test.log(Status.INFO, consoleOutput.toString());
		
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@AfterMethod
	public void getTestResult(ITestResult result) {

	        if (result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Fail", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        } else if (result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Pass", ExtentColor.GREEN));
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Skip", ExtentColor.ORANGE));
	        }
	}
	
	@AfterTest
	public void tearDown() {
		reports.flush();
	}

}
