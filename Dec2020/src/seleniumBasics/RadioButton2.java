package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement radio_male = driver.findElement(By.xpath("//input[@id='male']"));
		
	//	System.out.println("check selected before click + "+radio_male.isSelected());
		
		radio_male.click();
		System.out.println("above selected");
		boolean somevariable = radio_male.isSelected();
		if(!somevariable)   // if(somevaribale == false)
		{
			radio_male.click();
			System.out.println("check selected after click + "+radio_male.isSelected());
		}
		else
		{
			System.out.println("its already selected");
		}
		
		
		
		
		
	}

}
