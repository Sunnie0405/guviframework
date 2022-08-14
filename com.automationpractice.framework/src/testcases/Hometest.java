package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import Utilities.TestUtil;
import java.io.IOException;
import pages.HomePage;


public class Hometest extends BaseClass {
	
	@Test
	public void clickadminTest() throws IOException, InterruptedException {
		logger = extent.startTest("Home Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Women's Section");
		hp.clickWomen();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}

}
