package Automation.Framework;

public class LoginPage {
	AutomationFramework T;

	public LoginPage(String PlatformName) {
		Utils.initialiseVars();
		T = Utils.getAutomatedTest("Web");
		T.launchApplication();
		T.createObjectRepo("LoginPage");

	}
	
	public void doLogin(String Username, String Password)
	{
		T.enterText(T.objectRepo.get("UserNameField"), Username);
		T.enterText(T.objectRepo.get("PasswordField"), Password);
		T.click(T.objectRepo.get("LoginButton"));
	}

}
