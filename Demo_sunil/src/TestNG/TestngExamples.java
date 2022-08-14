package TestNG;

import org.testng.annotations.Test;

public class TestngExamples {
	
	@Test(priority=1,invocationCount=5) 
	public void methodOne() {
		System.out.println("h");
	}
	
	@Test (priority=2,enabled=false)
	public void methodTwo() {
		System.out.println("hello world2");
	}
	
	@Test (priority=3)
	public void methodThree() {
		System.out.println("hello world3");
	}
}
