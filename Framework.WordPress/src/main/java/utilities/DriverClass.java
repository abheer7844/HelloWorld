package utilities;

import org.openqa.selenium.WebDriver;

public class DriverClass {
	
	public static WebDriver driver;
	public static boolean bResult;
	public  DriverClass(WebDriver driver){
		DriverClass.driver = driver;
		DriverClass.bResult = true;
		Log.info("Chrome driver initialisation complete");
	}

}
