package Automation.Framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTest extends AutomationFramework {

	public void launchApplication() {
		// Utils Utils = new Utils();
		// System.setProperty("webdriver.chrome.driver",
		// Utils.envUsables.get("ChromeDriverPath"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBMADMIN\\Documents\\Driver\\chromedriver.exe");
	    DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setCapability("browserName", "chrome");
	    try {
			D=new RemoteWebDriver(new URL("http://172.25.96.1:4724/wd/hub"),cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		D.get(Utils.envUsables.get("ApplicationURL"));
	}

	public void enterText(WebElement E, String v) {
		E.clear();
		E.sendKeys(v);
	}

	public void createObjectRepo(String FileName) {
		super.createObjectRepo(FileName + "_Web");
	}
}
