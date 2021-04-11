package seleniumAdvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle3 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement lab_resize_homepage = driver.findElement(By.xpath("//a[text()='Resizable']"));
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("frame count is-> "+frames.size());
		
		System.out.println("before switch to frame-> "+lab_resize_homepage.getText());
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println("source get text is-> "+source.getText());
		driver.switchTo().defaultContent(); //original wall
		System.out.println("after switch to frame-> "+lab_resize_homepage.getText());
		
	}

}
