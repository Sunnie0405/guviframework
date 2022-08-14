package reporting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utilities {
	
	public static String ScreenShotName;
	public static void CaptureScreenShot() throws IOException {
		Date d=new Date();
		String d1=d.toString().replace(":", "_").replace(" ", "_");
		
		String ScreeShotName="Screen_"+d1+".jpg";
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destpath=System.getProperty("user.dir")+"//src//test//Screeshots//"+ScreeShotName;
		File dest=new File(destpath);
		FileUtils.copyFile(scr, dest);
		logger.log(LogStatus.INFO, logger.addScreenCapture(destpath));
		
	}

}
