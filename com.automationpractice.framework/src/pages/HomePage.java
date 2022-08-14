package pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class HomePage extends BaseClass {

	public void clickWomen() {
		driver.findElement(By.xpath("//*[text()='Women']")).click();
		driver.findElement(By.xpath("(//*[contains(text()='Tops')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text()='T-shirts')])[1]")).click();
		
	}
}
