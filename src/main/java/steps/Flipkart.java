package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;



public class Flipkart {
	public static ChromeDriver driver;

	@Given("launch browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("maximize browser window")
	public void maximize() {
		driver.manage().window().maximize();
	}


	
	public static ChromeDriver getDriver() {
		return driver;
	}
	public static void setDriver(ChromeDriver driver) {
		Flipkart.driver = driver;
	}
	@And("enter url")
	public void enterUrl() {
		driver.get("https://www.flipksrt.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("enter jfj")
	public void enterjfj()
	{
		System.out.println("dbfdsghf");
	}

	@And("enter <uname> and <pwd>")
	public void enterFirstNameAsTestleaf(String uname1, String pwd1) throws InterruptedException  {

		WebElement uname  = driver.findElement(By.xpath(""));
		WebElement pwd = driver.findElement(By.xpath(""));

		uname.sendKeys(uname1);
		pwd.sendKeys(pwd1);
		Thread.sleep(5000);

		WebElement ok = driver.findElement(By.xpath(""));
		ok.clear();

		Thread.sleep(2000);
	}

	@And("completed ah")
	public void completed()
	{
		System.out.println("completed");	
	}
	public void hi()
	{
		System.out.println("ss");
	}

	@And("completed successfully")
	public void completedsuccessfully()
	{
		System.out.println("yes");	
	}


}

