package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\come.guvi.framework\\Resources\\exe\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.guvi.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		if (extent == null) {
			extent = new ExtentReports("C:\\Users\\User\\eclipse-workspace\\come.guvi.framework\\Resources\\Reports\\ExtentReports.html",true);
			extent.loadConfig(new File("C:\\Users\\User\\eclipse-workspace\\come.guvi.framework\\ReportsConfig.xml"));
			}
}
	
	@AfterSuite
	public void tearDown() 
	{
		if(driver!=null) {
		driver.quit();
		extent.flush();
	}
}
	}

