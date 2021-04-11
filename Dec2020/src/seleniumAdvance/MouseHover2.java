package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[text()='']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement lab_electronics_flipkart = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(lab_electronics_flipkart);
		
		System.out.println("moved to element electonics");
		
	
		
	}

}
