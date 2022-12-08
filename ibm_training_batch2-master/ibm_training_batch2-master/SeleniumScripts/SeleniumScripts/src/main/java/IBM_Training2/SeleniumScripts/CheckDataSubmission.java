package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckDataSubmission 
{
	/*
	 * 1. Open browser
	 * 2. Open URL "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test"
	 * 3. Enter "Pranoday" in FirstName field
	 * 4. Enter "Dingare" in LastName field
	 * 5. Click on Submit button
	 * 6. Check that FirstName and LastName has indeed been submitted
	 * 7. Click on Run button
	 */
	
	ChromeDriver D;
	
	
	@BeforeClass
	public void StartTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	}
	
	@Test
	public void TestDataSubmission()
	{
		D.switchTo().frame("iframeResult");
		WebElement FirstNameField=D.findElement(By.id("fname"));
		FirstNameField.sendKeys("Pranoday");
		
		String FirstName=FirstNameField.getAttribute("value");
		
		WebElement LastNameField=D.findElement(By.id("lname"));
		LastNameField.sendKeys("Dingare");
		
		String LastName=LastNameField.getAttribute("value");
		
		WebElement SubmitButton=D.findElement(By.cssSelector("input[value='Submit']"));
		SubmitButton.click();		

		//WebElement DivElement=D.findElement(By.className("w3-container w3-large w3-border"));
		WebElement DivElement=D.findElement(By.cssSelector("div[class='w3-container w3-large w3-border']"));
		String DivTxt=DivElement.getText();
		boolean IsFirstNameExists=DivTxt.contains(FirstName);
		boolean IsLastNameExists=DivTxt.contains(LastName);
		
		Assert.assertEquals(IsFirstNameExists, true,"First name is not submitted");
		Assert.assertEquals(IsLastNameExists, true,"Last name is not submitted");
		D.switchTo().defaultContent();
		WebElement RunButton=D.findElement(By.id("runbtn"));
		RunButton.click();
	}
	
}
