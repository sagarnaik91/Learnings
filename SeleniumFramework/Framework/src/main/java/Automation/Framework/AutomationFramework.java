package Automation.Framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;


public abstract class AutomationFramework {
	RemoteWebDriver D;
	//private static final WebElement WebElement = null;
	HashMap<String, WebElement> objectRepo = new HashMap<String, WebElement>();

	public abstract void launchApplication();

	public void click(WebElement E) {
		E.click();
	}

	public void appendText(WebElement E, String text) {

		E.sendKeys(text);
	}

	public abstract void enterText(WebElement E, String v);

	public void createObjectRepo(String objectRepoFile)
	{
		//Utils Utils=new Utils();
		String ObjectRepoFilePath=Utils.envUsables.get("ObjectRepositoriesPath");
		try {
			FileReader FR1=new FileReader(ObjectRepoFilePath+"\\"+objectRepoFile+".txt");
			BufferedReader BR1=new BufferedReader(FR1);
			String line1=BR1.readLine();
			while(line1!=null)
			{
				String[] parts=line1.split(",");
				String elementReference= parts[0];
				String stratergyToken=parts[1];
				String locator=parts[2];
				WebElement E=findAndReturnElement(stratergyToken,locator);
				objectRepo.put(elementReference, E);
				line1=BR1.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public WebElement findAndReturnElement(String stratergyToken,String locator)
	{
		WebElement requiredElement=null;
		switch(stratergyToken)
		{
		case "BY_ID":
			requiredElement=D.findElement(By.id(locator));
			break;
		case "BY_NAME":
			requiredElement=D.findElement(By.name(locator));
			break;
		case "BY_CSS":
			requiredElement=D.findElement(By.cssSelector(locator));
			break;
		
		}
		return requiredElement;
		
	}
	
	
}

