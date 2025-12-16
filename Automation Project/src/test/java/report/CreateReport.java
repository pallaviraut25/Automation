package report;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.BaseClass;

public class CreateReport extends BaseClass {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		ExtentSparkReporter esr=new ExtentSparkReporter(projectpath+"\\Report\\ReportGenerated\\");
		
		esr.config().setDocumentTitle("Automation Report");
		esr.config().setReportName("Ecommerce Report");
		esr.config().setTheme(Theme.STANDARD);
		
		
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		
		//System Configuration
		
		er.setSystemInfo("OS", "Window");
		er.setSystemInfo("Browser", "Chrome");
		er.setSystemInfo("Domain", "Ecommerce");
		er.setSystemInfo("Application", "Flipkart");
		er.setSystemInfo("Junior Quality Analyst", "Pallavi Raut");
		
		ExtentTest et = er.createTest("Launch Browser");
		
		et.log(Status.INFO, "LaunchBrowser");
		
		ExtentTest et1 = er.createTest("Hit URL");
		
		et1.log(Status.PASS, "Pass Hit URL");
		
		ExtentTest et2 = er.createTest("Search Functionality");
		
		et2.log(Status.FAIL, "LaunchBrowser");
		
		ExtentTest et3 = er.createTest("send data");
		
		et3.log(Status.SKIP, "send data");
		
		launch_browser("chrome");
		
		HitUrl("https://www.flipkart.com/");
		
		er.flush();
				
			
		}
	}


