package IBMTraining_2.AutomationFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import IBMTraining_2.AutomationFramework.Utilities.Utils;
public class AndroidTest extends AutomationTest 
{

	public void LaunchApplication()
	{
		DesiredCapabilities Cap=new DesiredCapabilities(); 
		Cap.setCapability("app", Utils.EnvVars.get("AndroidAPKFilePath"));
		Cap.setCapability("deviceName", Utils.EnvVars.get("AndroidDeviceName"));
		Cap.setCapability("platformName", "Android");
		Cap.setCapability("automationName", "UiAutomator2");
		Cap.setCapability("appPackage", Utils.EnvVars.get("AndroidAppPackage"));
		Cap.setCapability("appActivity", Utils.EnvVars.get("AndroidAppActivity"));
		try {
			D=new AndroidDriver(new URL("http://192.168.0.102:4723/wd/hub"),Cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void EnterText(WebElement E,String Val)
	{
		E.sendKeys(Val);
	}

	public void CreateObjectRepository(String FileName)
	{
		super.CreateObjectRepository(FileName+"_Android");
	}
}
