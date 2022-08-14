package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import TestUtil.Utilities;
import java.io.IOException;
import pages.HomePage;

public class DropdownTest extends BaseClass {
	
	@Test
	public void clickDropdownTest() throws InterruptedException, IOException {
		logger = extent.startTest("Dropdown Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking Popularity");
		hp.clickSortBy();
		Thread.sleep(2000);
		Utilities.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
	}
	

}
