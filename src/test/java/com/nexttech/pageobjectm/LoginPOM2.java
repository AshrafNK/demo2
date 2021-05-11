package com.nexttech.pageobjectm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM2 {
	
	WebDriver driver;
	   public LoginPOM2(WebDriver driver) {
		   
		   this.driver=driver;
		   
		   PageFactory.initElements(driver, this);
	   }
	@FindBy (xpath="/html/body/div[1]/div[2]/div[2]/span[3]/a/span[2]")
	WebElement click_MyAccount;
	public WebElement MyAccount() {
		return click_MyAccount;
	}
	
	@FindBy (name="email_address")
	WebElement edit_emailaddress;
	public WebElement emailaddress() {
		return edit_emailaddress;
	}
	
	@FindBy (name="password")
	WebElement edit_password;
	public WebElement password() {
		return edit_password;
	}
	
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div[1]/div/form/p[2]/span/button/span[2]")
	WebElement click_signIN;
	public WebElement signIN() {
		return click_signIN;
	}
}
