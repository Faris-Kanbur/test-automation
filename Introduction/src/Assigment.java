import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;

		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> trNumber = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tr"));

		System.out.println(trNumber.size());
		
		List<WebElement> thNumber = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tr[1]//th"));
		
		System.out.println(thNumber.size());
		
		String text = driver.findElement(By.xpath("//div[@class='left-align']//table[@id='product']//tr[3]")).getText();

		System.out.println(text);

		
		

	}

}
