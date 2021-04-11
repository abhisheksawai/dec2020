package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFBTitle {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedtitle = "Facebook – log in or sign upp"; // got it from brd for ex
		String actualtitle = driver.getTitle();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title is matching hence test case is passed");
		}
		else
		{
			System.out.println("title is not matching hence test case is failed");
		}
		
	}

}
