package seleniumAdvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		ele.click();
		
		
	//	Thread.sleep(5000);
		
		System.out.println("launched website");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("wrog")).click();
		
		
		int totalCol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		
		String companytoSearch = "National Fertilizers";
		System.out.println("this is my company to search");
		
		List <WebElement> compnayName = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("compnayName.size()"+compnayName.size());
		
		List<WebElement> prevClose = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		System.out.println("taking all prev vlose value here");
		
		for(int i=0;i<5 ; i ++)
		{
				System.out.println(compnayName.get(i).getText());
				if(compnayName.get(i).getText().equalsIgnoreCase(companytoSearch))
				{
					System.out.println("yes got the company");
					System.out.println("prevClose.get(i).getText()--> "+prevClose.get(i).getText());
					break;
				}
		}
	}

}
