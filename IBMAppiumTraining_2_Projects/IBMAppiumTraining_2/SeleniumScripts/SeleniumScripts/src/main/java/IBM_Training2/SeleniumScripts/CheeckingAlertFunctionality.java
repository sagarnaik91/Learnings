package IBM_Training2.SeleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*
 * 1. Open browser
 * 2. Open URL "https://courses.letskodeit.com/practice"
 * 3. Enter "Pranoday" in textbox
 * 4. Click on Alert button
 * 5. Get the alert message
 * 6. Check that string "Pranoday" is present in alert message
 */
public class CheeckingAlertFunctionality 
{

	ChromeDriver D;
	
	WebElement TextBox;
	@BeforeClass
	public void StartTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\IBMTraining_2\\Drivers\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://courses.letskodeit.com/practice");
	}

	@Test
	public void CheckAlertMessage()
	{
		WebElement NameField=D.findElement(By.id("name"));
		NameField.sendKeys("Anindita");
		String EnteredName=NameField.getAttribute("value");
		
		WebElement AlertBtn=D.findElement(By.id("alertbtn"));
		AlertBtn.click();
		Alert Al=D.switchTo().alert();
		/*
		 * Hello Anindita, share this practice page and share your knowledge
		 */
		String AlertMessage=Al.getText();
		System.out.println(AlertMessage);
		boolean ISNamePresent=AlertMessage.contains(EnteredName);
		Assert.assertEquals(ISNamePresent, true,"Wrong alert message is shown");
		Al.accept();
	}
}
