package testNGAttributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dependon2 {
	
	@Test
	public void TC01_Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//			WebElement destination = driver.findElement(By.xpath("//*[@id='bank']/li"));
//			Actions act = new Actions(driver);
//			act.dragAndDrop(source, destination).build().perform();
	
	}
	@Test(dependsOnMethods="TC01_Login")
	public void buymobile()
	{
		System.out.println("buy mobile");
	}

}
