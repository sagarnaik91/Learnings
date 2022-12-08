package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckingEnableDisableFunctionality 
{

	/*1. Open browser
	 *2.Open URL "https://courses.letskodeit.com/practice"
	 *3. Click on Disable button
	 *4. Check that textbox is disabled successfully
	 *5.Click on Enable button
	 *6. Check that textbox should get enabled
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
		D=new ChromeDriver();
		D.get("https://courses.letskodeit.com/practice");
		//D.manage().window().maximize();
	}

	@Test(priority=1)
	public void TestDisableButton()
	{
	
		/*
		 * CSS query syntax:
		 * 	TagName[AttributeName='AttributeValue']
		 */
		WebElement DisableButton=D.findElement(By.cssSelector("input[value='Disable']"));
		DisableButton.click();
		TextBox=D.findElement(By.id("enabled-example-input"));
		boolean IsTextboxEnabled=TextBox.isEnabled();
		Assert.assertEquals(IsTextboxEnabled, false,"Disable button does not work");
	}
	
	@Test(priority=2)
	public void TestEnableButton()
	{
		WebElement EnabledButton=D.findElement(By.cssSelector("input[value='Enable']"));
		EnabledButton.click();
		boolean IsTextboxEnabled=TextBox.isEnabled();
		Assert.assertEquals(IsTextboxEnabled, true,"Enabled button is not working");
	}

	@AfterClass
	public void Stop()
	{
		D.close();
	}
}
