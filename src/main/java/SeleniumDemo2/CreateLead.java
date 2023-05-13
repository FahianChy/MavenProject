package SeleniumDemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fahia\\eclipse-workspace\\MavenProject\\drivers\\chromedriver.exe");	
		
	ChromeDriver driver = new ChromeDriver();
	//maximize
	//driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//enter URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize window
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//enter Username
	//driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	//click login
	driver.findElementByClassName("decorativeSubmit").click();
	//click CRM/SFa
	  
		
		
	}

}
