package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckHintText {
	
	/*1. Open browser
	 *2.Open URL "https://courses.letskodeit.com/practice"
	 *3. Check the hint text of textbox
	 * 
	 */
	ChromeDriver D;
	
	WebElement TextBox;
	@BeforeClass
	public void StartTest()
	{
		/*
			1. Open browser
		 *	2.Open URL "https://courses.letskodeit.com/practice"\
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\IBMTraining_2\\Drivers\\geckodriver.exe");
		D=new ChromeDriver();
		
		D.get("https://courses.letskodeit.com/practice");
		//D.manage().window().maximize();
	}

	@Test
	public void checkHintText()
	{
	
		WebElement TextBox=D.findElement(By.name("enter-name"));
		String HintText=TextBox.getAttribute("placeholder");
		Assert.assertEquals(HintText, "Enter Your Name","Wrong hint text is shown");
	}

	
}
