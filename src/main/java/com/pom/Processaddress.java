package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Processaddress {
	
	public WebDriver driver;
	
	@FindBy(name="processAddress")
	WebElement processaddress;

	public Processaddress(WebDriver driver8) {
		this.driver = driver8;
		
		PageFactory.initElements(driver8, this);
	}
		

	public WebElement getProcessaddress() {
		return processaddress;
	}
	

}
