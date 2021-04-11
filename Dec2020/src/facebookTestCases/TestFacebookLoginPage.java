package facebookTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import facebookPages.FacebookLoginPage;
import facebookPages.FacebookSignUpPage;

public class TestFacebookLoginPage {
	//WebDriver driver = new ChromeDriver();
	@Test(description="test case facebook login")
	public void tco1_LoginFacebook()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FacebookLoginPage lp = new FacebookLoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();		
		
	}
	
	@Test(description = " test cases facebook signup")
	public void tco1_SignUFacebook()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FacebookLoginPage lp = new FacebookLoginPage(driver);
		lp.clickSignup();
		
		FacebookSignUpPage sp = new FacebookSignUpPage(driver);
		sp.enterFirstName();
		sp.enterLastName();
	}
	


}
