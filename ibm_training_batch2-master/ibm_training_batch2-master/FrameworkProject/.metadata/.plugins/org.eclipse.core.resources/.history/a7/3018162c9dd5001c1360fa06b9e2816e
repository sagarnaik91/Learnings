package IBMTraining_2.AutomationFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import IBMTraining_2.AutomationFramework.Utilities.*;
public class WebTest extends AutomationTest
{
	public void LaunchApplication()
	{
		System.setProperty("webdriver.chrome.driver", Utils.EnvVars.get("ChromeDriverPath"));
		DesiredCapabilities Cap=new DesiredCapabilities();
		Cap.setCapability("browserName", "chrome");
		try {
			D=new RemoteWebDriver(new URL("http://192.168.0.102:4724/wd/hub"),Cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		D.get(Utils.EnvVars.get("ApplicationURL"));
	}

	public void EnterText(WebElement E,String val)
	{
		E.clear();
		E.sendKeys(val);
	}

	public void CreateObjectRepository(String FileName)
	{
		super.CreateObjectRepository(FileName+"_Web");
	}
}
