package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit {
	
	public WebDriver driver;
	
	public Submit(WebDriver driver12) {
		
		this.driver = driver12;
		PageFactory.initElements(driver12, this);
		
	}

	

	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	

}
