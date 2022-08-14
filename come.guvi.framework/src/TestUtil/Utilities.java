package TestUtil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utilities extends BaseClass {

	
	public static void CaptureScreenShot() throws IOException { 
		Date d =new Date();
		String d1=d.toString().replace(":", "_").replace(" ", "_");
		String ScreeShotName="Screen_"+d1+".jpg";
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destpath= "C:\\Users\\User\\eclipse-workspace\\come.guvi.framework\\Resources\\Reports\\Screenshots"+ScreeShotName;
		File dest=new File(destpath);
		FileUtils.copyFile(scr, dest);
		logger.log(LogStatus.INFO, logger.addScreenCapture(destpath));
}

}
