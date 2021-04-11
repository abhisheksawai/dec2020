package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown7 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement dd_testingdrop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Select s = new Select(dd_testingdrop);
		System.out.println("s.getfirst selected is "+s.getFirstSelectedOption().getText());
		
		WebElement getfirst = s.getFirstSelectedOption();
		System.out.println("getfirst "+getfirst.getText());
	}

}
