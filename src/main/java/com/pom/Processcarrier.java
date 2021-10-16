package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Processcarrier {
	
	public WebDriver driver;
	
	@FindBy(name="processCarrier")
	WebElement processcarrier;

	public Processcarrier(WebDriver driver10) {
		this.driver = driver10;
		
		PageFactory.initElements(driver10, this);
	}

	public WebElement getProcesscarrier() {
		return processcarrier;
	}
	

}
