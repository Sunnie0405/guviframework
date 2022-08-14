package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExampleTwo {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Hi i am before test");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("Hi i am after test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Hi i am before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Hi i am after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hi i am before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hi i am after method");
	}
	
	@Test()
	public void alpha() {
		System.out.println("hi i am a testng method 1");
	}
	
	@Test
	public void beta() {
		System.out.println("hi i am a testng method 2");
	}
	
	@Test
	public void gamma() {
		System.out.println("hi i am a testng method 3");
	}

}