package com.automationtask;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Singletonpattern.Singleton_Design_pattern;
import com.baseclass.Base_class;
import com.configuration_package.File_Reader_Manager;
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

@SuppressWarnings("unused")
public class Dresscheckout extends Base_class {

	public static WebDriver drive;
	
	public static WebDriver driver = Base_class.get_driver("chrome");
	
	public static Singleton_Design_pattern sdp = new Singleton_Design_pattern(driver);
	
	public static void main(String[] args) throws Throwable {

		String geturl = File_Reader_Manager.getInstanceFrm().getInstanceCR().geturl();
		
		getUrl(geturl);
		
		System.out.println(geturl);
		
		clickon(sdp.getInstancehp().getSigin_btn());
		
		String getusername = File_Reader_Manager.getInstanceFrm().getInstanceCR().getusername();
		
		System.out.println(getusername);
		
		passvalue(sdp.getLp().getUsername(), getusername);
		
		String getpassword = File_Reader_Manager.getInstanceFrm().getInstanceCR().getpassword();
		
		System.out.println(getpassword);
		
		passvalue(sdp.getLp().getPassword(), getpassword);
		
//		getUrl("http://automationpractice.com/index.php");
//
//		clickon(sdp.getInstancehp().getSigin_btn());
//
//		passvalue(sdp.getLp().getUsername(), "223300@gmail.com");
//
//		passvalue(sdp.getLp().getPassword(), "sak123");

		clickon(sdp.getLp().getLoggedin());

		wait(10);

		clickon(sdp.getDs().getDresses());

		Thread.sleep(1000);

		clickon(sdp.getDs().getEveningdress());

		Thread.sleep(1000);
		
		javaexe();
		
		clickon(sdp.getQv().getQuickview());
		
		clickon(sdp.getOrder().getIncreasetheqty());
		
		for (int i = 1; i <= 10; i++) {
			clickon(sdp.getOrder().getIncreasetheqty());
		}
		
		clickon(sdp.getOrder().getAddtocart());
		
		javaexe();
	
		wait(10);Thread.sleep(1000);
		
		clickon(sdp.getPc().getProceedtocheck());wait(10);
		
		javaexe();

		clickon(sdp.getPc1().getProceddtocheck1());wait(10);

		clickon(sdp.getAd().getProcessaddress());Thread.sleep(1000);
		
		javaexe();

		clickon(sdp.getAd1().getCheckbox());//

//		clickon(sdp.getAd1().getProcessaddress1());

		clickon(sdp.getPcc().getProcesscarrier());

		clickon(sdp.getPb().getPaybybank());

		clickon(sdp.getSb().getSubmit());

		clickon(sdp.getMo().getMyorders());

		takecreenshot("C:\\Users\\SAKTHI\\eclipse-workspace\\Maven_1st_project\\snap\\pp.png");

//		close();

//		WebElement siginclick = drive.findElement(By.xpath("//a[@title='Log in to your customer account']"));
//		
//		clickon(siginclick);
//		
//		WebElement email = drive.findElement(By.xpath("//input[@name='email_create']"));
//
//		passvalue(email, "3x0x0@gmail.com");
//
//		WebElement click = drive.findElement(By.id("SubmitCreate"));
//		
//		clickon(click);
//		
//		wait(10);
//		
//		WebElement malegender = drive.findElement(By.xpath("//label[@for='id_gender1']"));
//		
//		clickon(malegender);
//		
//		WebElement firstname = drive.findElement(By.xpath("//input[@id='customer_firstname']"));
//		
//		passvalue(firstname, "sakthi");
//		
//		WebElement lastname = drive.findElement(By.id("customer_lastname"));
//		
//		passvalue(lastname, "Vetrivelan");
//		
//		WebElement password = drive.findElement(By.name("passwd"));
//		
//		passvalue(password, "sak123");
//		
//		WebElement birthdate = drive.findElement(By.name("days"));
//		
//		selectdownindex(birthdate, 14);
//	
//		WebElement month = drive.findElement(By.name("months"));
//		
//		selectdownindex1(month, 8);
//
//		WebElement years = drive.findElement(By.name("years"));
//		
//		selectdownindex2(years, 1993);
//
//		WebElement company = drive.findElement(By.id("company"));
//		
//		passvalue(company, "Greens");
//		
//		WebElement address = drive.findElement(By.xpath("(//input[@type='text'])[8]"));
//		
//		passvalue(address, "cuddalore");
//		
//		WebElement city = drive.findElement(By.name("city"));
//		
//		passvalue(city, "cuddalore");
//	
//		WebElement state = drive.findElement(By.name("id_state"));
//		
//		selectdownindex3(state, 5);
//		
//		WebElement postcode = drive.findElement(By.id("postcode"));
//		
//		passvalue(postcode, "00000");
//
//		WebElement mobno = drive.findElement(By.name("phone"));
//		
//		passvalue(mobno, "022222222222");
//		
//		WebElement add = drive.findElement(By.xpath("//input[@value='My address']"));
//		
//		passvalue(add, "cuddalore port");
//	
//		WebElement created = drive.findElement(By.id("submitAccount"));
//		
//		clickon(created);
//		
//		wait(10);
//		
//		WebElement dress = drive.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
//		
//		clickon(dress);
//		
//		movetoelement(dress);
//		
//		wait(10);
//		
//		WebElement dresscategories = drive.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a"));
//		
//		clickon(dresscategories);
//		
//		WebElement dress1 = drive.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
//		
//		clickon(dress1);
//		
//		WebElement frame = drive.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		
//		iframe(frame);
//		
//		clickon(frame);
//		
//		WebElement addplus = drive.findElement(By.xpath("//i[@class='icon-plus']"));
//		
//		addcart(addplus);
//		
//		WebElement size = drive.findElement(By.id("group_1"));
//		
//		WebElement colour = drive.findElement(By.name("Pink"));
//		
//		clickon(colour);
//		
//		WebElement addtocart = drive.findElement(By.id("add_to_cart"));
//		
//		clickon(addtocart);
//		
//		defaultframe();
//		
//		wait(10);
//		
//		WebElement proceedtocheckout = drive.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
//		
//		clickon(proceedtocheckout);
//		
//		WebElement check = drive.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
//		
//		clickon(check);
//		
//		WebElement processadrress = drive.findElement(By.name("processAddress"));
//		
//		clickon(processadrress);
//		
//		WebElement checkto = drive.findElement(By.xpath("//*[@id=\"cgv\"]"));
//		
//		clickon(checkto);
//		
//		WebElement processcarrier = drive.findElement(By.name("processCarrier"));
//		
//		clickon(processcarrier);
//		
//		WebElement paybybank = drive.findElement(By.xpath("//a[@title='Pay by bank wire']"));
//		
//		clickon(paybybank);
//		
//		WebElement submit = drive.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		
//		clickon(submit);
//		
//		WebElement myorders = drive.findElement(By.xpath("//a[text()='My orders']"));
//		
//		clickon(myorders);
//		
//		
//		
//		
//		

//		drive.get("http://automationpractice.com/index.php");
//
//		drive.manage().window().maximize();
//
//		drive.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
//
//		WebElement email = drive.findElement(By.xpath("//input[@name='email_create']"));
//
//		email.sendKeys("223300@gmail.com");
//
//		drive.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//
//		drive.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//
//		drive.findElement(By.xpath("//label[@for='id_gender1']")).click();
//
//		WebElement firstname = drive.findElement(By.xpath("//input[@id='customer_firstname']"));
//
//		firstname.sendKeys("sakthi");
//
//		WebElement lastname = drive.findElement(By.id("customer_lastname"));
//
//		lastname.sendKeys("Vetrivelan");
//
//		WebElement password = drive.findElement(By.name("passwd"));
//
//		password.sendKeys("sak123");
//
//		WebElement birthdate = drive.findElement(By.name("days"));
//
//		Select s = new Select(birthdate);
//
//		s.selectByValue("14");
//
//		WebElement month = drive.findElement(By.name("months"));
//
//		Select s1 = new Select(month);
//
//		s1.selectByValue("8");
//
//		WebElement years = drive.findElement(By.name("years"));
//
//		Select s2 = new Select(years);
//
//		s2.selectByValue("1993");
//
//		drive.findElement(By.id("company")).sendKeys("Greens");
//
//		WebElement address = drive.findElement(By.xpath("(//input[@type='text'])[8]"));
//
//		address.sendKeys("LIG 166 Cudddalore");
//
//		WebElement city = drive.findElement(By.name("city"));
//
//		city.sendKeys("cuddalore");
//
//		WebElement state = drive.findElement(By.name("id_state"));
//
//		Select s3 = new Select(state);
//
//		s3.selectByVisibleText("California");
//
//		WebElement postcode = drive.findElement(By.id("postcode"));
//
//		postcode.sendKeys("00000");
//
//		WebElement mobno = drive.findElement(By.name("phone"));
//
//		mobno.sendKeys("022222222222");
//
//		WebElement add = drive.findElement(By.xpath("//input[@value='My address']"));
//
//		add.sendKeys("cuddalore port");
//
//		drive.findElement(By.id("submitAccount")).click();
//
//		drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		drive.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
//
//		JavascriptExecutor js = (JavascriptExecutor) drive;
//
//		js.executeScript("window.scrollBy(0,1500);");
//
//		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		drive.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")).click();
//
//		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		js.executeScript("window.scrollBy(0,500);");
//		
//		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		Actions ac = new Actions(drive);
//
//		WebElement dress = drive.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
//		
//		ac.click(dress).build().perform();
//		
//		WebElement frame = drive.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//
//		drive.switchTo().frame(frame);
//
//		WebElement addplus = drive.findElement(By.xpath("//i[@class='icon-plus']"));
//
//		for (int i = 1; i < 10; i++) {
//			addplus.click();
//		}
//
//		WebElement size = drive.findElement(By.id("group_1"));
//
//		Select se4 = new Select(size);
//
//		se4.selectByValue("2");
//
//		drive.findElement(By.name("Pink")).click();
//
//		drive.findElement(By.id("add_to_cart")).click();
//		
//		drive.switchTo().defaultContent();
//		
//		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		drive.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
//		
//		js.executeScript("window.scrollBy(0,2000)");
//		
//		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		drive.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
//		
//		js.executeScript("window.scrollBy(0,2000)");
//		
//		drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		drive.findElement(By.name("processAddress")).click(); 
//		
//		Thread.sleep(1000);
//		
//		drive.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
//		
//		drive.findElement(By.name("processCarrier")).click();
//		
//		drive.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
//		
//		drive.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		
//		js.executeScript("window.scrollBy(0,2000);");
//		
//		drive.findElement(By.xpath("//a[text()='My orders']")).click();	
//	
//		TakesScreenshot ts = (TakesScreenshot) drive;
//		
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		
//		File f2 = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\seleniumtask\\screenshot\\p1o.png");
//		
//		FileUtils.copyFile(screenshotAs, f2);

	}
}
