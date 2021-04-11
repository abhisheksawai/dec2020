package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement dd_testingdrop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Select s = new Select(dd_testingdrop);
	//	Select s = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
		s.selectByVisibleText("Manual Testing");
		
		
	}

}
