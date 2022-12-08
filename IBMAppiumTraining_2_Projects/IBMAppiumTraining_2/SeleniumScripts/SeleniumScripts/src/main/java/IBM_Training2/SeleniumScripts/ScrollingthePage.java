package IBM_Training2.SeleniumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollingthePage {

	RemoteWebDriver D;
	@BeforeClass
	public void StartTest() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://courses.letskodeit.com/practice");
		
	}
	
	@Test
	public void TestHovering()
	{
		WebElement MouseHoverButton=D.findElement(By.id("mousehover"));
		//D.executeScript("arguments[0].scrollIntoView();", MouseHoverButton);
		//D.executeScript("arguments[0].scrollIntoView(false);", MouseHoverButton);
		D.executeScript("arguments[0].scrollIntoView({block:'center'});", MouseHoverButton);
		Actions Act=new Actions(D);
		Act.moveToElement(MouseHoverButton).perform();
		WebElement TopLink=D.findElement(By.linkText("Top"));
		TopLink.click();
		
	}
}
