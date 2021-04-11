package testNGReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void startmyReport()
	{
		extent = new ExtentReports("E:\\World Of Program\\Dec2020\\extentreport2.html");
		extent.addSystemInfo("Env","QA");
	}
	
	@Test
	public void passExtentReport()
	{
		logger = extent.startTest("check guru launch");
		System.out.println("launch chrome");
		System.out.println("thread for guru99 "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		logger.log(LogStatus.PASS, "Launch browser hence pass the test cases");
	}
	
	
	@Test
	public void failedExtentReport()
	{
		logger = extent.startTest("check failedExtentReport");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL, "expecting true but getting false here");
	}
	
	@AfterMethod
	public void endreport()
	{
		extent.endTest(logger);
	}
	
	@AfterClass
	public void completeReport()
	{
		extent.flush();
		extent.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
