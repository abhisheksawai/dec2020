package testNGReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGReport3 {
	
	
	@Test
	public void tes3ttc01_one()
	{
		System.out.println("TestNGReport3-a");
	}
	
	@Test
	public void test3tc02_two()
	{
		System.out.println("TestNGReport3=b");
	}
	
	@Test
	public void test3tc03_three()
	{
		System.out.println("TestNGReport3-3");
	}
	
	@Test
	public void TC01_LoginWrong()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	}
	

}
