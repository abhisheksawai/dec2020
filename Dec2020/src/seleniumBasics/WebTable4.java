package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable4 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		
		int totalCol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("total totalCol are "+totalCol);
		
		String companytoSearch = "National Fertilizers";
		
		List <WebElement> compnayName = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("compnayName.size()"+compnayName.size());
		
		List<WebElement> prevClose = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		
		for(int i=0;i<compnayName.size() ; i ++)
		{
				System.out.println(compnayName.get(i).getText());
		}
		
		
	}

}
