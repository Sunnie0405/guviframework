package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class HomePage extends BaseClass {
	
	public void clickCourses() {
		driver.findElement(By.xpath("//*[contains(text(),'Course Library')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Step into Robotic Process Automation')]")).click();
	}
	
	public void clickCombo() {
		driver.findElement(By.id("offersList")).click();
	}
	
	public void clickFreeLibrary() {
		driver.findElement(By.id("contact-tab")).click();
	}
	
	public void clickMycourses() {
		driver.findElement(By.id("contact-my")).click();
	}
	
	public void clickSortBy() {
		Select s = new Select(driver.findElement(By.xpath("//*[contains(text(),'Explore')]")));
		s.selectByValue("Programming Languages");
	}
	
	}
		
	

