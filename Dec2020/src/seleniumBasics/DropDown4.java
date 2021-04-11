package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement dd_testingdrop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Select s = new Select(dd_testingdrop);
	//	Select s = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
	//	s.selectByVisibleText("Manual Testing");
	//	s.selectByIndex(3);
	//	s.selectByValue("Performance");
		
		List<WebElement> options = s.getOptions();
		System.out.println("count of dropdown value "+options.size());
		System.out.println(options);
		for(int i = 0 ;i <options.size() ; i ++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
