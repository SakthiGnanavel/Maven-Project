package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview {
	
	public WebDriver driver;
	
	@FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
	WebElement quickview;

	public Quickview(WebDriver driver4) {
		
		this.driver = driver4;
		
		PageFactory.initElements(driver4, this);

	}

	public WebElement getQuickview() {
		return quickview;
	}
	
	

}
