package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import util.TestReport;

public class Listners extends Base implements ITestListener {//when the tests are executing the Listeners class is listen the TC and  performed necessary actions
	WebDriver driver=null;
	ExtentReports extent = TestReport.getExtentreport();
	ExtentTest extendtest;

	@Override
	public void onTestStart(ITestResult result) {
		String Testname=result.getName();
	
		 extendtest =  extent .createTest(Testname+"execution is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String Testname=result.getName();
		extendtest.log(Status.PASS, Testname+"got passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extendtest.fail(result.getThrowable());
	 driver = null;
		
		String testname=result.getName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		try {
			Screenshots(testname,driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		 extent .flush();
		
	}

}
