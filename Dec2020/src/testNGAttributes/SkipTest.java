package testNGAttributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(enabled = false)
	public void tc02_two()
	{
		System.out.println("tc02_two");
	}
	
	@Test
	public void tc01_one()
	{
		System.out.println("tc01_one");
	}

}
