package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReport {
	static ExtentReports extentReports;
	
	public static ExtentReports getExtentreport() {
		
	String	path=System.getProperty("user.id")+"\\reports\\extentreport.html";
	ExtentSparkReporter Report=new ExtentSparkReporter(path);
		Report.config().setReportName("TestReport");
		Report.config().setDocumentTitle("Automation testing");
		
		 extentReports=new ExtentReports();
		 extentReports.attachReporter(Report);
		 extentReports.setSystemInfo("Tested By", "Suneel c");
		
		return extentReports;
		
	}

}
