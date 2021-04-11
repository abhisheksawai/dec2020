package testNGDemoAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestCase3 {

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void TC01_verifyDragAndDrop()
	{
		System.out.println("Test Case Exeuction print msg - TC01_verifyDragAndDrop");
	}
	
	@Test
	public void TC02_verifyDragAndDrop()
	{
		System.out.println("Test Case Exeuction print msg - TC02_verifyDragAndDrop");
		
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}

}
