package IBMTraining_2.TestCaseProject.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import IBMTraining_2.TestCaseProject.Pages.LoginPage;

public class LoginTestCaseWithValid
{
	/*
	 * 1. Open Application
	 * 2. Enter Username in UserName field
	 * 3. Enter Password in password field
	 * 4. Click on Login button
	 * 5. Check that dashboard page is opened
	 */
	
	/*
	 * 
	 @BeforeClass
	 public void StartTest() throws MalformedURLException
	{
		DesiredCapabilities Cap=new DesiredCapabilities(); 
		Cap.setCapability("app", "D:\\IBMAppiumTraining\\EriBank.apk");
		Cap.setCapability("deviceName", "And1");
		Cap.setCapability("platformName", "Android");
		Cap.setCapability("automationName", "UiAutomator2");
		Cap.setCapability("appPackage", "com.experitest.ExperiBank");
		Cap.setCapability("appActivity", "LoginActivity");
		D=new AndroidDriver(new URL("http://192.168.0.102:4723/wd/hub"),Cap);
	
	}

	@Test
	public void DoLogin()
	{
		WebElement OKButton=D.findElement(By.id("android:id/button1"));
		OKButton.click();
		
		WebElement UserNameField=D.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField"));
		UserNameField.sendKeys("company");
		
		WebElement PasswordField=D.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField"));
		PasswordField.sendKeys("company");
		
		WebElement Loginbutton=D.findElement(By.id("com.experitest.ExperiBank:id/loginButton"));
		Loginbutton.click();
		
	}

	public void TestInvalid()
	{
	
		WebElement OKButton=D.findElement(By.id("android:id/button1"));
		OKButton.click();
		
		WebElement UserNameField=D.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField"));
		UserNameField.sendKeys("Pranoday");
		
		WebElement PasswordField=D.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField"));
		PasswordField.sendKeys("Dingare");
		
		WebElement Loginbutton=D.findElement(By.id("com.experitest.ExperiBank:id/loginButton"));
		Loginbutton.click();
	
	}
	 */
	LoginPage Pg1;
	@BeforeClass
	public void StartTest()
	{
		Pg1=new LoginPage("Web");
	}
	@Test
	public void TestLoginWithValidCredentials()
	{
		Pg1.DoLogin("Admin","admin123");
	}
}
