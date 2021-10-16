package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheck1 {
	public WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proceddtocheck1;
	
	

	public Proceedtocheck1(WebDriver driver7) {
		this.driver = driver7;
		
		PageFactory.initElements(driver7, this);
		
	}

	public WebElement getProceddtocheck1() {
		return proceddtocheck1;
	}
	
	

}
