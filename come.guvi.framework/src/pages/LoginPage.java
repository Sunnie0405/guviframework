package pages;

import org.openqa.selenium.By;

import Base.BaseClass;
import TestUtil.Utilities;
import java.io.IOException;

public class LoginPage extends BaseClass {
	
		public void doLogin(String username, String password) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		driver.findElement(By.id("login_email")).sendKeys(username);
		driver.findElement(By.id("login_password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("login_button")).click();
		Utilities.CaptureScreenShot();
		Thread.sleep(2000);
		
}
		
}
