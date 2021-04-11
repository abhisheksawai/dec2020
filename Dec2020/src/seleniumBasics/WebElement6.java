package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement6 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement btn_login_fb = driver.findElement(By.xpath("//input[@class='Automation']"));
		
		// how to check the checkbox
		btn_login_fb.click();
		
		boolean checkisSelected = btn_login_fb.isSelected();
		System.out.println("printing checkisSelected "+checkisSelected);
		
		
		
	}

}
