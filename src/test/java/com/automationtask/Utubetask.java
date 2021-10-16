package com.automationtask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utubetask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAKTHI\\eclipse-workspace\\seleniumtask\\drive\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();

		drive.get("https://www.youtube.com/");

		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		drive.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Doctor Trailer");

		drive.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		drive.findElement(By.xpath(
				"(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"))
				.click();

		drive.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
	}

}
