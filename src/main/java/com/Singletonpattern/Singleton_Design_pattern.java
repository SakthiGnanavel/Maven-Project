package com.Singletonpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.pom.Dress_Selection;
import com.pom.Home_page;
import com.pom.Login_page;
import com.pom.Myorders;
import com.pom.Ordertheitems;
import com.pom.Paybybank;
import com.pom.Proceedtocheck;
import com.pom.Proceedtocheck1;
import com.pom.Processaddress;
import com.pom.Processaddress1;
import com.pom.Processcarrier;
import com.pom.Quickview;
import com.pom.Submit;

public class Singleton_Design_pattern {

	public WebDriver driver;

	public Singleton_Design_pattern(WebDriver driver15) {
		this.driver = driver15;

		PageFactory.initElements(driver15, this);
	}

	public Login_page getLp() {
		lp = new Login_page(driver);
		return lp;
	}

	public Dress_Selection getDs() {
		ds = new Dress_Selection(driver);
		return ds;
	}

	public Quickview getQv() {
		qv = new Quickview(driver);
		return qv;
	}

	public Ordertheitems getOrder() {
		order = new Ordertheitems(driver);
		return order;
	}

	public Proceedtocheck getPc() {
		pc = new Proceedtocheck(driver);
		return pc;
	}

	public Proceedtocheck1 getPc1() {
		pc1 = new Proceedtocheck1(driver);
		return pc1;
	}

	public Processaddress getAd() {
		ad = new Processaddress(driver);
		return ad;
	}

	public Processaddress1 getAd1() {
		ad1 = new Processaddress1(driver);
		return ad1;
	}

	public Processcarrier getPcc() {
		pcc = new Processcarrier(driver);
		return pcc;
	}

	public Paybybank getPb() {
		pb = new Paybybank(driver);
		return pb;
	}

	public Submit getSb() {
		sb = new Submit(driver);
		return sb;
	}

	public Myorders getMo() {
		mo = new Myorders(driver);
		return mo;
	}

	private Home_page hp;
	private Login_page lp;
	private Dress_Selection ds;
	private Quickview qv;
	private Ordertheitems order;
	private Proceedtocheck pc;
	private Proceedtocheck1 pc1;
	private Processaddress ad;
	private Processaddress1 ad1;
	private Processcarrier pcc;
	private Paybybank pb;
	private Submit sb;
	private Myorders mo;

	public Home_page getInstancehp() {
		hp = new Home_page(driver);
		return hp;

	}

}
