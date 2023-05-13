package Wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
 
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
	
		ChromeDriver driver = new ChromeDriver();
	
		// maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// Enter Username - (Element level)
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		//String cssValue = driver.findElementById("username").getCssValue("id");
		//System.out.println(cssValue);
		
		// Enter Password - (Element level)
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//input[@value='Login']").click();

		// click crm/sfa link
		
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
	}
		@AfterMethod
		public void closeBrowse() {
driver.close();
	}
	
	}
