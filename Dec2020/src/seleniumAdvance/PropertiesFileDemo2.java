package seleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertiesFileDemo2 {
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File src = new File("E:\\World Of Program\\Dec2020\\ObjectRepository.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		//driver.findElement(By.xpath("//input[@id='emailnew']")).sendKeys("abhishek");
		//System.out.println(driver.findElement(By.xpath(pro.getProperty("txt_username_login_Facebook"))));
		System.out.println(pro.getProperty("txt_username_login_Facebook"));
		
		driver.findElement(By.xpath(pro.getProperty("txt_username_login_Facebook"))).sendKeys("Rod");
		
		
	}

}
