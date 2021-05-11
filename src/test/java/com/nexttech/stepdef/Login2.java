package com.nexttech.stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Login2 {
    
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
		driver = new ChromeDriver();
		
		driver.get("https://demo.oscommerce.com/");
    }

}