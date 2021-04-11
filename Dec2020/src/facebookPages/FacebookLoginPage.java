package facebookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {
	
	By txt_username_login_facebook = By.id("email");
	By txt_password_login_facebook = By.xpath("//input[@name='pass']");
	By btn_loginButton_login_facebook = By.name("login");
	By link_signup_login_facebook = By.xpath("//a[text()='Sign Up']");
	
	WebDriver driver;
	//page class will identy webelement of webpage
	
	public FacebookLoginPage(WebDriver driver) {
	
		this.driver = driver;
	
	}

	public void enterUsername()
	{
		driver.findElement(txt_username_login_facebook).sendKeys("Abhishek");
	}
	
	public void enterPassword()
	{
		driver.findElement(txt_password_login_facebook).sendKeys("abhi@12345678");
	}

	public void clickLoginButton()
	{
		driver.findElement(btn_loginButton_login_facebook).click();
	}
	
	public void clickSignup()
	{
		driver.findElement(link_signup_login_facebook).click();
	}
	
}
