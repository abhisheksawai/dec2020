package seleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExe {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='querytext']")).sendKeys("Pune");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(("document.getElementById('querytext').value='Mumbai'"));
		
	}

}
