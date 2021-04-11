package seleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		System.out.println("before window current url is "+driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		
		System.out.println("after window current url is "+driver.getCurrentUrl());
		
		Set <String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println("after switch to window - current url is "+driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println("after switch to parent window - current url is "+driver.getCurrentUrl());
		
		
		
	}

}
