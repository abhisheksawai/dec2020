package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		ChromeDriver driver = new ChromeDriver();  //jayanta c1 c2 c3
//		FirefoxDriver driver1 = new FirefoxDriver();  // arun  f1 f2 f3
//		WebDriver driver2 = new ChromeDriver();
//		WebDriver driver3 = new FirefoxDriver();
//		//a1 a2 a3
	}

}
