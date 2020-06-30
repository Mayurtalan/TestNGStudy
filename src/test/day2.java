package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "Smoke" })
	public void ploan() {
		System.out.println("P Loan in day 2");
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("Before Test in day 2");
	}
}
