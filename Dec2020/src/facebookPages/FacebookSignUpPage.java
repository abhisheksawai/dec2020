package facebookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookSignUpPage {
	
	By txt_firstName_signup_facebook = By.xpath("//input[@name='firstname']");
	By txt_surName_signup_facebook = By.xpath("//input[@name='lastname']");
	By btn_signUpButton_signup_facebook = By.name("websubmit");
	WebDriver driver;
	
	
	public FacebookSignUpPage(WebDriver driver) {
		this.driver = driver;
	
	}
	public void enterFirstName()
	{
		driver.findElement(txt_firstName_signup_facebook).sendKeys("harshal");
	}
	public void enterLastName()
	{
		driver.findElement(txt_surName_signup_facebook).sendKeys("chavan");
	}	

	public void clickSignUp()
	{
		driver.findElement(btn_signUpButton_signup_facebook).click();
	}
	
}
