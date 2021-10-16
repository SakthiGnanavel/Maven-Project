package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paybybank {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement paybybank;

	public Paybybank(WebDriver driver11) {
		this.driver = driver11;
		
		PageFactory.initElements(driver11, this);		
	}

	public WebElement getPaybybank() {
		return paybybank;
	}
	
	
}
