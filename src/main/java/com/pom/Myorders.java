package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myorders {

	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='My orders']")
	WebElement myorders;

	public Myorders(WebDriver driver13) {
		this.driver = driver13;
		
		PageFactory.initElements(driver13, this);
		
	}

	public WebElement getMyorders() {
		return myorders;
	}
	
	
	
	
}
