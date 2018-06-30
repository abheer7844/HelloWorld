import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class demo {

	public static void main(String[] args) {
		
	
	//	ChromeDriverManager.getInstance().setup();
	//	WebDriver driver = new ChromeDriver();
		FirefoxDriverManager.getInstance().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rishabh Patil\\Downloads\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
