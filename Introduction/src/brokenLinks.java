import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// All links
		// Broken URL/Link
	    // Java methods will call URL's and gets you the status code
		// a[href='https://www.soapui.org/']  or a[href*='soapui']

		
		
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		
		SoftAssert mySoftAssert = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection connect = (HttpURLConnection)new URL(url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			String respCode = connect.getResponseMessage(); // OK
			int respCodeNumber = connect.getResponseCode(); // 200
			System.out.println(respCode);
			System.out.println(respCodeNumber);
			
			// 1.Way soft assert
			mySoftAssert.assertTrue(respCodeNumber < 400, "The link with text " + url+ " is broken code "+ respCodeNumber);

			
			
			// 2.Way hard assert
			Assert.assertTrue(respCodeNumber < 400, "The link with text " + url+ " is broken code "+ respCodeNumber);
			
			// 3.way hard assert
			
			//if(respCodeNumber > 400){
		    //		System.out.println("The link with text " + url+ " is broken code "+ respCodeNumber );
		    //		Assert.assertTrue(false);}
		}
		
		// if you don't use that it will record all failure but it is not going to report it
		mySoftAssert.assertAll();
		
		
		
	}

}
