package utils;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoreDemo {
	
	
	@Test
	public void test1() {
		System.out.println("I am inside tc1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside tc2");
	}
	@Test
	public void test3() {
		System.out.println("I am inside tc3");
	}
	
}
