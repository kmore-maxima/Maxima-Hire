package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends BasePage {
	
		
	@FindBy(xpath="//input[@placeholder='First name']")
	WebElement reg_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement reg_lastName_input;
	
	@FindBy(xpath="//input[@placeholder='Client name']")
	WebElement reg_clientName_input;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement reg_emailAddress_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm email address']")
	WebElement reg_confirmEmailAddress_input;
	
	@FindBy(xpath="//input[@placeholder='Create password']")
	WebElement reg_createPassword_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement reg_confirmPassword_input;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement reg_register_button;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement reg_login_link;
	
	@FindBy(xpath="//a[@class='register btn btn-primary']" )
	WebElement reg_mainRegister_button;
	
	@FindBy(xpath="//div[@class='vue-notification-template vue-notification success']")
	WebElement reg_sucessNotification_msg;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getReg_firstName_input() {
		return reg_firstName_input;
	}

	public WebElement getReg_lastName_input() {
		return reg_lastName_input;
	}

	public WebElement getReg_clientName_input() {
		return reg_clientName_input;
	}

	public WebElement getReg_emailAddress_input() {
		return reg_emailAddress_input;
	}

	public WebElement getReg_confirmEmailAddress_input() {
		return reg_confirmEmailAddress_input;
	}

	public WebElement getReg_createPassword_input() {
		return reg_createPassword_input;
	}

	public WebElement getReg_confirmPassword_input() {
		return reg_confirmPassword_input;
	}

	public WebElement getReg_register_button() {
		return reg_register_button;
	}

	public WebElement getReg_login_link() {
		return reg_login_link;
	}

	public WebElement getReg_mainRegister_button() {
		return reg_mainRegister_button;
	}
	

	public WebElement getReg_sucessNotification_msg() {
		return reg_sucessNotification_msg;
	}


	public void register(String firstname, String lastname,String clientname,String email,String confirmemail,String password,
			String confirmpassword) throws InterruptedException
	{ 
		Thread.sleep(3000);
		getReg_mainRegister_button().click();
		getReg_firstName_input().sendKeys(firstname); 
		getReg_lastName_input().sendKeys(lastname);
		getReg_clientName_input().sendKeys(clientname);
		getReg_emailAddress_input().sendKeys(email);
		getReg_confirmEmailAddress_input().sendKeys(confirmemail);
		getReg_createPassword_input().sendKeys(password);
		getReg_confirmPassword_input().sendKeys(confirmpassword);
		getReg_register_button().click();
		getReg_login_link().click();
		Assert.assertTrue(getReg_sucessNotification_msg().isDisplayed());
		System.out.println(" User Registered sucessfully");

		
		
		} 
	
	}

		
	


