package IBMTraining_2.TestCaseProject.TestCases;

import IBMTraining_2.TestCaseProject.Pages.LoginPage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class LoginStepDefinations 
{
	LoginPage Pg1;
	@Given("User is on Login screen")
	public void OpenApplication()
	{
		Pg1= new LoginPage("WEB");
	}
	@When("User enters \"Admin\" in UserName field")
	public void EnterUserName()
	{
		Pg1.EnterUserName("Admin");
	}
	@When("User enters \"admin123\" in Password field")
	public void EnterPassword()
	{
		Pg1.EnterPassword("admin123");
	}
	@When("User clicks on Login button")
	public void ClickOnLogin()
	{
		Pg1.ClickLoginButton();
	}
}
