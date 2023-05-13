package SleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class lunchchromebrowser {

	public static void main(String[] args) {
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\fahia\\eclipse-workspace\\MavenProject\\drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrom.driver", "./driver.chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();	
		
	driver.get("http://leaftaps.com/opentaps/control/main/");	
	
	driver.get("http://google.com");
	driver.manage().window().maximize();
	
	//get the page title
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	
	
	driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
	
	//enter user name

	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//Click login
	driver.findElementByClassName("decorativeSubmit");
	
	//Click crmsfa
	driver.findElementByLinkText("CRM/SFA").click();
	
	//Creat lead link
	driver.findElementByLinkText("Create Lead").click();
	
	//Enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	
	//enter first name
	
	driver.findElementById("createLeadForm_firstName").sendKeys("HEMA");

	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	
	
	driver.findElementById("createLeadForm_personalTitle").sendKeys("Gali");
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Sen");
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("9000");
	driver.findElementById("createLeadForm_departmentName").sendKeys("Education");
	driver.findElementById("createLdriver.eadForm_sicCode").sendKeys("123456");
	driver.findElementById("createLeadForm_description").sendKeys("Reform the system");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("5000");
	driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Nul");
	driver.findElementById("createLeadForm_importantNote").sendKeys("care");
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	driver.findElementByClassName("inputBox").sendKeys("30,columbia st.");
	driver.findElementById("createLeadForm_generalCity").sendKeys("Hudson");
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12534");
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("1804");
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("5188229065");
	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("5189667321");
	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/control/login");
	driver.findElementById("createLeadForm_generalAttnName").sendKeys("x");
	driver.findElementByClassName("inputBox").sendKeys("same");
	driver.findElementByClassName("smallSubmit").click();

	
}

	
	
	
	
	
	
	
	}


