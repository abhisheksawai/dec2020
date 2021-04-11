package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoggerDemo {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		System.out.println("launched website");
		
		driver.manage().window().maximize();
		System.out.println("browser maximised");
		
		int totalCol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("total totalCol are "+totalCol);
		System.out.println("got the count of total coulum");
		
		String companytoSearch = "National Fertilizers";
		System.out.println("this is my company to search");
		
		List <WebElement> compnayName = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("compnayName.size()"+compnayName.size());
		System.out.println("got the count of company name column");
		
		List<WebElement> prevClose = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		System.out.println("taking all prev vlose value here");
		
		for(int i=0;i<compnayName.size() ; i ++)
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
		
	}

}
