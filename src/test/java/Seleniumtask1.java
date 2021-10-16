

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumtask1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAKTHI\\eclipse-workspace\\seleniumtask\\drive\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
	
		drive.manage().window().maximize();
		
		drive.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
//		WebElement user = drive.findElement(By.xpath("//input[@type='text']"));
//		
//		user.sendKeys("Sakthi");
//		
//		Thread.sleep(2000);
//		
//		WebElement pass = drive.findElement(By.xpath("//input[@type='password']"));
//		
//		pass.sendKeys("12345");
//		
		Thread.sleep(1000);
//		
//		WebElement create = drive.findElement(By.xpath(("(//a[@role='button'])[2]")));
//		
//		create.click();
		
		WebElement firstname = drive.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		
		firstname.sendKeys("sakthi");
		
		WebElement lastname = drive.findElement(By.xpath("//input[@name='lastname']"));
		
		lastname.sendKeys("vetrivelan");
		
		WebElement mobnum = drive.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		
		mobnum.sendKeys("12364");
		
		WebElement date = drive.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select sd = new Select(date);
		
		sd.selectByValue("14");
		
		WebElement month = drive.findElement(By.xpath("//select[@title='Month']"));
		
		Select sm = new Select(month);
		
		sm.selectByIndex(8);
		
		WebElement year = drive.findElement(By.xpath("//select[@title='Year']"));
				
		Select sy = new Select(year);
		
		sy.selectByVisibleText("1993");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
