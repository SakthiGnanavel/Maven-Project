package com.automationtask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_class;

public class Dressselection {
	

	public static void main(String[] args) throws InterruptedException, IOException {

	
	WebDriver drive = new ChromeDriver();	
		

		drive.get("http://automationpractice.com/index.php");

		drive.manage().window().maximize();

		drive.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();

		WebElement email = drive.findElement(By.xpath("//input[@name='email_create']"));

		email.sendKeys("sca10001201352pp@gmail.com");

		drive.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		drive.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		drive.findElement(By.xpath("//label[@for='id_gender1']")).click();

		WebElement firstname = drive.findElement(By.xpath("//input[@id='customer_firstname']"));

		firstname.sendKeys("sakthi");

		WebElement lastname = drive.findElement(By.id("customer_lastname"));

		lastname.sendKeys("Vetrivelan");

		WebElement password = drive.findElement(By.name("passwd"));

		password.sendKeys("sak123");

		WebElement birthdate = drive.findElement(By.name("days"));

		Select s = new Select(birthdate);

		s.selectByValue("14");

		WebElement month = drive.findElement(By.name("months"));

		Select s1 = new Select(month);

		s1.selectByValue("8");

		WebElement years = drive.findElement(By.name("years"));

		Select s2 = new Select(years);

		s2.selectByValue("1993");

		drive.findElement(By.id("company")).sendKeys("Greens");

		WebElement address = drive.findElement(By.xpath("(//input[@type='text'])[8]"));

		address.sendKeys("LIG 166 Cudddalore");

		WebElement city = drive.findElement(By.name("city"));

		city.sendKeys("cuddalore");

		WebElement state = drive.findElement(By.name("id_state"));

		Select s3 = new Select(state);

		s3.selectByVisibleText("California");

		WebElement postcode = drive.findElement(By.id("postcode"));

		postcode.sendKeys("00000");

		WebElement mobno = drive.findElement(By.name("phone"));

		mobno.sendKeys("022222222222");

		WebElement add = drive.findElement(By.xpath("//input[@value='My address']"));

		add.sendKeys("cuddalore port");

		drive.findElement(By.id("submitAccount")).click();

		drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		drive.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		JavascriptExecutor js = (JavascriptExecutor) drive;

		js.executeScript("window.scrollBy(0,1500);");

		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		drive.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")).click();

		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0,500);");
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions ac = new Actions(drive);

		WebElement dress = drive.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		
		ac.click(dress).build().perform();
		
		WebElement frame = drive.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		drive.switchTo().frame(frame);

		WebElement addplus = drive.findElement(By.xpath("//i[@class='icon-plus']"));

		for (int i = 1; i < 10; i++) {
			addplus.click();
		}

		WebElement size = drive.findElement(By.id("group_1"));

		Select se4 = new Select(size);

		se4.selectByValue("2");

		drive.findElement(By.name("Pink")).click();

		drive.findElement(By.id("add_to_cart")).click();
		
		TakesScreenshot ts = (TakesScreenshot) drive;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File fl = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\seleniumtask\\screenshot\\lo.png");
		
		FileUtils.copyFile(screenshotAs, fl);
		
		

	}

}
