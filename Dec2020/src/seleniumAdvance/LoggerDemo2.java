package seleniumAdvance;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoggerDemo2 {
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Logger log = Logger.getLogger("March Regression Release 7.3");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("----------------Execution Started -----------------------");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		Thread.sleep(5000);
		
		System.out.println("launched website");
		log.info("website launched rediff ");
		
		driver.manage().window().maximize();
		System.out.println("browser maximised");
		
		int totalCol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("total totalCol are "+totalCol);
		System.out.println("got the count of total coulum");
		log.info("got the total col count here and it is --> "+totalCol);
		
		String companytoSearch = "National Fertilizers";
		System.out.println("this is my company to search");
		log.info("company to search --> "+companytoSearch);
		
		List <WebElement> compnayName = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("compnayName.size()"+compnayName.size());
		System.out.println("got the count of company name column");
		
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
		System.out.println("done with for loop and comparison with company name");
		System.out.println("execution completed");
		log.info("----------------Execution End -----------------------");
	}

}
