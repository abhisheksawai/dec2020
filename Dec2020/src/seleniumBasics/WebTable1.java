package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		// for first row
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[4]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[5]")).getText());

		
		// for secodn row
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]/td[1]")).getText());
		
	}

}
