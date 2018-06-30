package action;

import pageObject.PO_WP_Login;
import tests.Tests;
import utilities.Log;
import utilities.Wait_Objects;

public class WP_Login {
	
public static boolean flag = false;
	
	public static void positiveLogin(String URL) throws Exception{
		
		flag = false;
		
		try{
			PO_WP_Login.openSite(URL);
			Log.info("URL Opened");
			
			Wait_Objects.explicit_Wait(PO_WP_Login.username);
			
			PO_WP_Login.setUsername(Tests.username);
			Log.info("Username Typed");
			
			PO_WP_Login.getButton().click();
			Log.info("Button Clicked");
			
			Wait_Objects.explicit_Wait(PO_WP_Login.password);
			
			PO_WP_Login.setPassword(Tests.password);
			Log.info("Password Entered");
			
			PO_WP_Login.getButton().click();
			Log.info("Login Button Clicked");
			
		 	Wait_Objects.explicit_Wait(PO_WP_Login.heading);
			
			String s = PO_WP_Login.getHeading().getText();
			
			if("Dashboard".equals(s)){
				Log.info("Finding heading Action Passed");
				flag = true;
			}

		}
		catch(Exception e){
			Log.info("Failed to execute further");
			throw new Exception("Problem in Method positiveLogin() "+e);
		}
		
				
	}

}
