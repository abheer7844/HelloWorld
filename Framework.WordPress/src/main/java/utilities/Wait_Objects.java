package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Objects extends DriverClass{
	

	public Wait_Objects(WebDriver driver) {
		
		super(driver);

	}
	
	public static void implicit_Wait(){
		
		Log.info("Implicit Wait Called");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@SuppressWarnings("unused")
	public static void explicit_Wait(By xp){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 
	}

}
