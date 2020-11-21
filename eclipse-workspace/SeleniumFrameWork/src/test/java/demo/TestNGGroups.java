package demo;

import org.testng.annotations.Test;

public class TestNGGroups {


	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("This is test1");
	}
	@Test(groups = {"sanity"})
	public void Test2() {
		System.out.println("This is test1");
	}
	@Test(groups = {"sanity","smoke","regression"})
	public void Test3() {
		System.out.println("This is test1");
	}

}
