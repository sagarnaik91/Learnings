package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCheckbox 
{

	ChromeDriver D;
	
	WebElement BMWCheckbox;
	@BeforeClass
	public void StartTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://courses.letskodeit.com/practice");
	}

	@Test(priority=1)
	public void TestCheckboxIsChecked()
	{
		BMWCheckbox=D.findElement(By.id("bmwcheck"));
		BMWCheckbox.click();
		boolean IsCheckboxChecked=BMWCheckbox.isSelected();
		Assert.assertEquals(IsCheckboxChecked, true,"After clicking on checkbox it is not getting checked");
	}

	@Test(priority=2)
	public void TestCheckboxIsUnchecked()
	{
		BMWCheckbox.click();
		boolean Pranoday=BMWCheckbox.isSelected();
		Assert.assertEquals(Pranoday, false,"After clicking on checkbox 2nd time it is not getting unchecked");
	}

}
