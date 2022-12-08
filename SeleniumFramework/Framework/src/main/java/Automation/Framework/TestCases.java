package Automation.Framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases {
	LoginPage Pg1;

	@BeforeClass
	public void startTest() {
		Pg1 = new LoginPage("Web");
	}

	@Test
	public void Login() {

		Pg1.doLogin("Admin", "admin123");
	}
}
