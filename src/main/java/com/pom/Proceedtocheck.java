package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheck {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	WebElement proceedtocheck;

	public Proceedtocheck(WebDriver driver6) {
		
		this.driver= driver6;
		
		PageFactory.initElements(driver6, this);
		
		
	}

	public WebElement getProceedtocheck() {
		return proceedtocheck;
	}
	
	

}
