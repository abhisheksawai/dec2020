package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorXpath2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("xpathexpress");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("xpathexpres1s");
		
		
		
		
	}

}