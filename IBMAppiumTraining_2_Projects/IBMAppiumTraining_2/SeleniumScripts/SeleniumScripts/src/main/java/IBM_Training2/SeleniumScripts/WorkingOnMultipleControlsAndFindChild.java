package IBM_Training2.SeleniumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkingOnMultipleControlsAndFindChild 
{

//ChromeDriver D;
	RemoteWebDriver D;
	@BeforeClass
	public void StartTest() throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\IBMTraining_2\\Drivers\\geckodriver.exe");
		DesiredCapabilities Cap=new DesiredCapabilities();
		Cap.setCapability("browserName", "chrome");
		D=new RemoteWebDriver(new URL("http://192.168.0.101:4724/wd/hub"),Cap);
		//D=new ChromeDriver();
		//D=new FirefoxDriver();
		D.get("https://courses.letskodeit.com/practice");
		
	}
	
	@Test
	public void CheckAllCheckBoxes()
	{
		
		WebElement DivElement=D.findElement(By.id("checkbox-example-div"));
		//List<WebElement>Checkboxes=D.findElements(By.name("cars"));
		List<WebElement>Checkboxes=DivElement.findElements(By.name("cars"));
		//List<WebElement>Checkboxes=D.findElements(By.xpath("//div[@id='checkbox-example-div']/descendant::input[@name='cars']"));
		System.out.println(Checkboxes.size());
		
		for(WebElement Checkbox:Checkboxes)
		{
			
			Checkbox.click();
			boolean IsCheckboxSelected=Checkbox.isSelected();
			Assert.assertEquals(IsCheckboxSelected, true,"Checkbox is not selected after clicking on it");
		}	
	}
	

}
