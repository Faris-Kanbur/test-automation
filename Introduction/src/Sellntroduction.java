import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellntroduction {

	public static void main(String[] args) {
		
		// Invoke Browser
		//Chrome - ChromeDriver -> Methods
		
		// chromedriver.exe -> chrome browser
		
		//WebDriver driver1 = new ChromeDriver();
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		//driver.quit();
	}

}
