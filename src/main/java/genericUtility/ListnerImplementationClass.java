package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import genericUtility.BaseTest;

public class ListnerImplementationClass implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log("from this"+methodname+"Exdecution Starts!!");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodsname=result.getMethod().getMethodName();
		Reporter.log(methodsname+"execution successfll!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenshotFolder\\"+methodname+".png");
		try {
			Files.copy(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log(methodname+"execution Skips!!");
	}
	


}
