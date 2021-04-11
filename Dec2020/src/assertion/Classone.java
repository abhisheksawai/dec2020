package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Classone extends Classtwo {

	@Test
	public void checkAssertions() throws Exception
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		
		Classone one = new Classone();
		//one.softAssertOne();
		one.softAssertTwo();
		one.softAssertThree();
		one.assertalldo();
		//one.hardAssert();
//		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
	}

}
