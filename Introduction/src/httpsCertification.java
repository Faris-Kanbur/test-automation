
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class httpsCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		
		
		
		// FirefoxOptions options1 = new FirefoxOptions();
		// EdgeOptions options1 = new EdgeOptions();

		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		// options.addExtensions("") => add path way to use your extensions in otomated browser
		WebDriver driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com");
		
		// Need Proxy ?
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress: 4444");  // ask your support  team for your proxyadress
		options.setCapability("proxy", proxy);
		
		// Block pop-up because default it allowed by browsaer
		// options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		
		System.out.println(driver.getTitle());
		


	}


}
