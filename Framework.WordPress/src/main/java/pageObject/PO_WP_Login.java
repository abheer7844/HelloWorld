package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.DriverClass;
import utilities.Log;


public class PO_WP_Login extends DriverClass {

	private static WebElement element =  null;
	
	public PO_WP_Login() {
		super(driver);
	}
	
	public static By username = By.xpath("//*[@id='usernameOrEmail']");
	public static By password = By.xpath("//*[@id='password']");
	public static By button = By.xpath("//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button");
	public static By heading = By.xpath("//*[@id='wpbody-content']/div[3]/h1");
	public static By signup = By.xpath("//*[@id='header']/div/a/span");
	public static By languageLink = By.xpath("//*[@id='primary']/div/main/div[1]/div/span[2]/span/div/div/a");
	public static By CloseLangLink = By.xpath("//*[@id='primary']/div/main/div[1]/div/span[3]/svg");
	public static By termsAndCond = By.xpath("//*[@id='primary']/div/main/div[2]/div[1]/div/form/div[1]/p/a");
	public static By contWithGoogleBtn = By.xpath("//*[@id='primary']/div/main/div[2]/div[1]/div/form/div[2]/div[2]/div/div/div/button");
	public static By lostPass= By.xpath("//*[@id='primary']/div/main/div[2]/div[2]/a[1]");
	public static By backToWP = By.xpath("//*[@id='primary']/div/main/div[2]/div[2]/a[2]");
	public static By passVisible = By.xpath("//*[@id='primary']/div/main/div[2]/div[1]/div/form/div[1]/div[1]/div/div/span/svg/g/path");
	
	public static void openSite(String url)throws Exception{
		try{
			Log.info("Trying URL....");
			driver.get(url);
			Log.info("URL Connected");
		}
		catch(Exception e){
			Log.info("URL Failed");
			throw new Exception("Some Problem with the URl"+ e);
		}
	}
	
	public static WebElement getUsername()throws Exception{
		
		try{
			Log.info("Finding Username Field");
			element = driver.findElement(username);
			Log.info("Username field Found");
		}
		catch(Exception e){
			Log.info("Username field finding failed");
			throw new Exception("Problem with username getting"+e);
		}
		return element;
	}
	
	public static WebElement getPassword()throws Exception{
		
		try{
			Log.info("Finding Password Field");
			element = driver.findElement(password);
			Log.info("Password Field Found");
		}
		catch(Exception e){
			Log.info("Password field finding failed");
			throw new Exception("Problem with password Field"+e);
		}
		return element;
	}
	
	public static WebElement getButton()throws Exception{
		
		try{
			Log.info("Finding Button");
			element = driver.findElement(button);
			Log.info("Button Found");
		}
		catch(Exception e){
			Log.info("Next/Login button finding failed");
			throw new Exception("Problem with Next/Login button finding"+e);
		}
		return element;
	}
	
	public static WebElement getHeading()throws Exception{
		try{
			Log.info("Finding Heading");
			element = driver.findElement(heading);
			Log.info("Heading Found");
		}
		catch(Exception e){
			Log.info("Heading finding failed ");
			throw new Exception("Problem with finding heading"+e);
		}
		return element;
	}
	
	public static void setUsername(String user)throws Exception {
		try{
			Log.info("Injecting username");
			getUsername().sendKeys(user);
		}
		catch(Exception e){
			Log.info("Injecting username failed");
			throw new Exception("Problem with username injection"+e);
		}
	}

	public static void setPassword(String pass)throws Exception {
		try{
			Log.info("Injecting Password");
			getPassword().sendKeys(pass);
		}
		catch(Exception e){
			Log.info("Injecting password failed");
			throw new Exception("Problem with password injection"+e);
		}
	}	

	public static WebElement getSignup()throws Exception{
		try{
			Log.info("Finding SignUp Button");
			element = driver.findElement(signup);
			Log.info("SignUp button found");
		}
		catch(Exception e){
			Log.info("Signup button finding failed");
			throw new Exception("Problem with signup button finding"+e);
		}
		return element;
	}

	public static WebElement getEnglishLink()throws Exception{
		try{
			Log.info("Finding English Language Link");
			element = driver.findElement(languageLink);
			Log.info("Link found");
		}
		catch(Exception e){
			Log.info("Link finding failed");
			throw new Exception("Problem with English Language Link"+e);
		}
		return element;
	}
	
	public static WebElement getCloseLangLink()throws Exception{
		try{
			Log.info("Close language Link Option finding");
			element = driver.findElement(CloseLangLink);
			Log.info("Close Langauge link found");
			
		}
		catch(Exception e){
			Log.info("Close language link button not found");
			throw new Exception("Problem with Close language Link Button"+e);
		}
		return element;
	}
	
	public static WebElement getTermsAndCond()throws Exception{
		try{
			Log.info("Finding Terms and Services link");
			element = driver.findElement(termsAndCond);
			Log.info("Terms and Services link found");
		}
		catch(Exception e){
			Log.info("Terms and Services link not found");
			throw new Exception("Problem in finding Terms and Services link"+e);
		}
		return element;
	}
	
	public static WebElement getContGoogleBtn()throws Exception{
		try{
			Log.info("Finding Continue with Google Button");
			element = driver.findElement(contWithGoogleBtn);
			Log.info("Continue with Google button found");
		}
		catch(Exception e){
			Log.info("Continue with Google button not found");
			throw new Exception("Problem in finding Continue with Google button"+e);
		}
		return element;
	}
	
	public static WebElement getLostPassLink()throws Exception{
		try{
			Log.info("Finding Lost password link");
			element = driver.findElement(lostPass);
			Log.info("Lost password link found");
		}
		catch(Exception e){
			Log.info("Lost password link not found");
			throw new Exception("Problem with lost password link"+e);
		}
		return element;
	}
	
	public static WebElement getBackWPLink()throws Exception{
		try{
			Log.info("Finding Back to Wordpress button");
			element = driver.findElement(backToWP);
			Log.info("Back to Wordpress button found");
		}
		catch(Exception e){
			Log.info("Back to wordpress button not found");
			throw new Exception("Problem in finding back to Wordpress button"+e);
		}
		return element;
	}
	
	public static WebElement getPassVisible()throws Exception{
		try{
			Log.info("Finding Password Visible Button");
			element = driver.findElement(passVisible);
			Log.info("Visible password button found");
		}
		catch(Exception e){
			Log.info("Visible password button not found");
			throw new Exception("Problem in finidng visible password button"+e);
		}
		return element;
	}

	
}
