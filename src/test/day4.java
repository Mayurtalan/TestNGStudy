package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname) {
		System.out.println("web login home Personal Loan in day 4");
		System.out.println(uname);

	}

	@Test(groups = { "Smoke" })
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile login Home in day 4");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("API login Home in day 4");
	}
}
