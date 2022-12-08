package IBMTraining_2.TestCaseProject.Pages;

import IBMTraining_2.AutomationFramework.AndroidTest;
import IBMTraining_2.AutomationFramework.AutomationTest;
import IBMTraining_2.AutomationFramework.Utilities.Utils;

public class LoginPage 
{
	AutomationTest T;
	public LoginPage(String PlatformName)
	{
		/*
		 * To take us to the login page by invoking an
		 * application
		 */
		Utils.InitialiseEnvVars();
		//T=new AndroidTest();
		T=Utils.GetAutomationTest(PlatformName);
		T.LaunchApplication();
		T.CreateObjectRepository("LoginPage");
	}
	public void DoLogin(String UserName,String Pass)
	{
		
		/*
		 * Entering Username
		 * Enter password
		 * Click on Login button
		 */
		//T.EnterText(T.ObjectRepo.get("UserNameField"), UserName);
		//T.EnterText(T.ObjectRepo.get("PasswordField"), Pass);
		//T.ClickElement(T.ObjectRepo.get("LoginButton"));
		EnterUserName(UserName);
		EnterPassword(Pass);
		ClickLoginButton();
	}
	
	public void EnterUserName(String UserName)
	{
		T.EnterText(T.ObjectRepo.get("UserNameField"), UserName);
	}
	
	public void EnterPassword(String Pass)
	{
		T.EnterText(T.ObjectRepo.get("PasswordField"), Pass);
	}
	public void ClickLoginButton()
	{
		T.ClickElement(T.ObjectRepo.get("LoginButton"));
	}
}
