package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Processaddress1 {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(xpath="//*[@id=\\\"cgv\\\"]")
	WebElement processaddress1;

	public Processaddress1(WebDriver driver9) {
		this.driver = driver9;
		
		PageFactory.initElements(driver9, this);
		
	}

	public WebElement getProcessaddress1() {
		return processaddress1;
	}
	
	

}
