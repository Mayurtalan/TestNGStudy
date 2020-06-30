package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last in Day 1");

	}

	@Test
	public void Demo() {
		System.out.println("Demo Method in Day 1");// automation
		// Assert.assertTrue(false);
	}

	@AfterSuite

	public void afSuite() {
		System.out.println("I am execute after Suit ");
	}

	@Test
	public void SecondTest() {
		System.out.println("Second Test In Day 1");
	}

}
