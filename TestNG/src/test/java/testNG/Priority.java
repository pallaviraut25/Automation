package testNG;

import org.testng.annotations.Test;

public class Priority {
	@Test
	public void d() {
		System.out.println("d");
	}

	@Test(description = "Above TestCase is running 3 Times")
	public void c() {
		System.out.println("c");
	}

	@Test(invocationCount = 3,priority=1)
	public void b() {
		System.out.println("b");
	}

	@Test(enabled =true )
	public void a() {
		System.out.println("a");
	}

}
