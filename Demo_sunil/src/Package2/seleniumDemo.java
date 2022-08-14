package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class seleniumDemo {
	
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Demo_sunil\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//*[@value='radio2']")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option3");
		
//		for Drop-down, we should prepare object first.
//		explicit wait
		
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
	}
//customwait function
//	public static void customwait(String xpath, int seconds) {
//		WebDriverWait wait = new WebDriverWait(driver, seconds);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
	}
	

