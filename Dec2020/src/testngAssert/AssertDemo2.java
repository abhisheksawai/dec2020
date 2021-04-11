package testngAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo2 {
	
	@Test
	public void verifyfacebookTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		String actualtitle=driver.getTitle();
		String Expectedtitle = "facebook";  // took it from brd
		
		//assert.assertEquals(actualtitle, Expectedtitle);
		
		//Assert.assertEquals(actualtitle, Expectedtitle);
		
		System.out.println("few line of code");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	

}
