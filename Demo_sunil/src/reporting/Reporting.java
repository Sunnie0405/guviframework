package reporting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public static void main(String[] args) {
		if (extent == null) {
			extent = new ExtentReports("C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\Reports\\ExtentReports.html",true);
			extent.loadConfig(new File("C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\Reports\\ReportsConfig.xml"));
		}
		
		//logging steps
		logger=extent.startTest("First Test Case");
		logger.log(LogStatus.INFO, "Setting system property");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		logger.log(LogStatus.INFO, "Initializing driver");
		WebDriver driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Opening google.com");
		driver.get("https://www.google.com/");
		logger.log(LogStatus.PASS, "Quitting the browser");
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}

}
