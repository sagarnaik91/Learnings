package IBMAppiumTraining2.AppiumScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SampleScript 
{
	AndroidDriver D;
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
}
	

