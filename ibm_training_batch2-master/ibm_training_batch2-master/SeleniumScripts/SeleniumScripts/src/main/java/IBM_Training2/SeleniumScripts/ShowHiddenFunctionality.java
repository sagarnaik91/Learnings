package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 	By.id->> Identifying element using Id attribute
	By.name->>Identifying element using name attribute
	By.TagName->>Identifying element using Tag 
	By.className->Identifying element using class attribute
	By.Xpath->>Identifying element using Xpath query
	By.css->>Identifying element using Css query
	By.linkText->>Identifying hyperlinks based on their texts
	By.partialLinkText->>Identifying hyperlinks based on substring in hyperlink text
 */
public class ShowHiddenFunctionality 
{
	/*1. Open browser
	 *2.Open URL "https://courses.letskodeit.com/practice"
	 *3. Click on Hide button
	 *4. Check that textbox is hidden successfully
	 *5.Click on Show button
	 *6. Check that textbox is shown bask on the page successfully
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
	public void TestHidenButton() throws InterruptedException 
	{
		/*
		 * Click on Hide button
		 * <input id="hide-textbox" class="btn-style class2" value="Hide" onclick="hideElement()" type="submit">
		 * Check if textbox is hidden
		 */
		WebElement HideButton=D.findElement(By.id("hide-textbox"));
		HideButton.click();
		Thread.sleep(5000);
		//Identify textbox using name attribute
		TextBox=D.findElement(By.name("show-hide"));
		boolean IsShown=TextBox.isDisplayed();
		Assert.assertEquals(IsShown, false,"Hide button is not working fine");
	}
	@Test(priority=2)
	public void TestShowButton() throws InterruptedException
	{
		WebElement ShowButton=D.findElement(By.id("show-textbox"));
		ShowButton.click();
		Thread.sleep(5000);
		boolean IsShown=TextBox.isDisplayed();
		Assert.assertEquals(IsShown, true,"Show button does not work");
		
	}
	@AfterClass
	public void StopTest()
	{
		D.close();
	}
}
