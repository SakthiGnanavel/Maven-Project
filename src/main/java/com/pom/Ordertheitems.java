package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordertheitems {

	public WebDriver driver;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	WebElement iframe;

	@FindBy(xpath = "//i[@class='icon-plus']")
	WebElement increasetheqty;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;

	public Ordertheitems(WebDriver driver5) {

		this.driver= driver5;
		
		PageFactory.initElements(driver5, this);
	
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getIncreasetheqty() {
		return increasetheqty;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	

}
