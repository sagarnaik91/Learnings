package Automation.Framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Utils {
	public static HashMap<String, String> envUsables = new HashMap<String, String>();

	public static void initialiseVars() {
		String FilePath = "C:\\SeleniumFramework\\envVars.txt";
		try {
			FileReader FR = new FileReader(FilePath);
			BufferedReader BR = new BufferedReader(FR);
			String line;
			line = BR.readLine();
			while (line != null) {
				String[] args = line.split(",");
				String variableName = args[0];
				String variableValue = args[1];
				envUsables.put(variableName, variableValue);
				line=BR.readLine();
			}
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error in reading file");
		}

	}

	public static AutomationFramework getAutomatedTest(String PlatformName) {
		AutomationFramework T = null;
		switch (PlatformName.toUpperCase()) {
		case "WEB":
			T = new WebTest();
			break;
//		case "ANDROID":
//			T=new AndroidTest();
		}
		return T;
	}
}
