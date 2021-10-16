package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection {
	public WebDriver driver;

	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	WebElement dresses;
	
	@FindBy(xpath="//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
	WebElement Eveningdress;

	public Dress_Selection(WebDriver driver3) {
		this.driver = driver3;
		
		PageFactory.initElements(driver3, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningdress() {
		return Eveningdress;
	}
	
	
	
	
	
}
