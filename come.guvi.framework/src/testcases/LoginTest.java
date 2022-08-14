package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import TestUtil.Utilities;
import java.io.IOException;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void clickLogin() throws InterruptedException, IOException {
		logger = extent.startTest("Login Test");
		LoginPage lp = new LoginPage();
		logger.log(LogStatus.INFO, "Clicking on Login");
		lp.doLogin("sunnie0405@gmail.com", "Ind@msk5");
		Utilities.CaptureScreenShot();
		Thread.sleep(10000);
		logger.log(LogStatus.PASS, "Login successful");
		Utilities.CaptureScreenShot();
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}
