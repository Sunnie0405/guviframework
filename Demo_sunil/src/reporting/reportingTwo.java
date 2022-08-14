package reporting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class reportingTwo {
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String ScreenShotName;
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	if (extent == null) {
		extent = new ExtentReports("C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\Reports\\ExtentReports.html",true);
		extent.loadConfig(new File("C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\Reports\\ReportsConfig.xml"));
		}
	
	if (driver == null) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
	}
	@AfterSuite 
	public void afterSuite() {
		extent.flush(); 
		logger.log(LogStatus.PASS, "Quitting the browser");
		driver.quit();
	}
	
	@Test
	public void testOne() throws IOException, InterruptedException {
		//logging steps
		logger=extent.startTest("First Test Case");
		logger.log(LogStatus.INFO, "Initializing driver");
		logger.log(LogStatus.INFO, "Opening yahoo.com");
		driver.get("https://www.yahoo.com/");
		reportingTwo.CaptureScreenShot();
		logger.log(LogStatus.INFO, "Writing in search bar");
		driver.findElement(By.name("q")).sendKeys("Hellow sunil");
		Thread.sleep(3000);
		reportingTwo.CaptureScreenShot();
		extent.endTest(logger);
		
		
	}

	@Test
	public void testTwo() throws IOException {
		//logging steps
		logger=extent.startTest("Second Test Case");
		logger.log(LogStatus.INFO, "Initializing driver");
		logger.log(LogStatus.INFO, "Opening google.com");
		driver.get("https://www.google.com/");
		reportingTwo.CaptureScreenShot();
		driver.findElement(By.name("q")).sendKeys("hello sunil");
		reportingTwo.CaptureScreenShot();
		extent.endTest(logger);
}

	
	
	public static void CaptureScreenShot() throws IOException {
		Date d =new Date();
		String d1=d.toString().replace(":", "_").replace(" ", "_");
		String ScreeShotName="Screen_"+d1+".jpg";
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destpath= "C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\Reports\\Screenshots"+ScreeShotName;
		File dest=new File(destpath);
		FileUtils.copyFile(scr, dest);
		logger.log(LogStatus.INFO, logger.addScreenCapture(destpath));
}
}