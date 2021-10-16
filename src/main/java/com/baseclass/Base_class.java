package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	private static final String javaexecutor = null;
	public static WebDriver driver;

	public static WebDriver get_driver(String browsertype) {

		if (browsertype.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browsertype.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drive\\geckodriver.exe");

			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;
	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void clickon(WebElement element) {

		element.click();

	}

	public static void passvalue(WebElement element, String Value) {

		element.sendKeys(Value);

	}

	public static void action(WebElement element, String type) {

		if (type.equalsIgnoreCase("click")) {

			Actions a = new Actions(driver);
			a.click(element).build().perform();
		}
	}

	public static void javaexe() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)");
//		js.executeScript("arguments[0].click", element);
	}

	public static void framemethod(WebElement element, String types) {

		if (types.equalsIgnoreCase("frame")) {
			driver.switchTo().frame(element);
		}else if (types.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}else if (types.equalsIgnoreCase("defaultframe")) {
			driver.switchTo().defaultContent();
		}
			

	}

	public static void wait(int wait) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void addcart(WebElement element) {

		for (int element1 = 0; element1 < 10; element1++) {

			element.click();

		}

	}

	public static void takecreenshot(String element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File filesource = ts.getScreenshotAs(OutputType.FILE);

		File location = new File(element);

		FileUtils.copyFile(filesource, location);

	}
	
	public static  void close() {
		driver.close();

	}

}
