package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import genericUtility.SeleniumUtility;



public class BaseTest {
	public static WebDriver driver=null;
	SeleniumUtility sut=null;
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() {
		System.out.println("connection established");
		
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception {
	String URL=	("https://dev-dash.janitri.in/");
	sut=new SeleniumUtility();
	driver=new ChromeDriver();
	driver.get(URL);
	sut.implicitWait(driver,10);
	sut.maximizeWindow(driver);
		
	}
	
	
	
	@AfterClass(alwaysRun=true)
	public void closeApp() {
		driver.close();
		System.out.println("browser closed sucessfully");
		
	}

	@AfterSuite(alwaysRun=true)
	public void closeConnection() {
		System.out.println("connection closed seccessfull");
		
	}
}

  
    
