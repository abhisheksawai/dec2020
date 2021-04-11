package seleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelReading2 {
	
	public static void main(String[] args) throws Exception {
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\decbrowser exe\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		String oneone = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(oneone);
		
		System.out.println("sh.getLastRowNum()--> "+sh.getLastRowNum());
		System.out.println("sh.getFirstRowNum()--> "+sh.getFirstRowNum());
		
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		System.out.println("row count is "+rowcount);
		
		int cellcount = sh.getRow(1).getLastCellNum();
		System.out.println("cell count is "+cellcount);
		
		
	}

}
