import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assigment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(5000);
		
		// 1. solution
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		//2. solution
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));

		for (int i = 0; i<options.size(); i++)

		{

		if (options.get(i).getText().equalsIgnoreCase("India"))

		{

		options.get(i).click();

		break;

		}
		
		
		//3.solution
		// for (WebElement option : options)	{

		// if (option.getText().equalsIgnoreCase("India")){
		// option.click();
		// break;
		// }}
		
		

		}

		}



		}
		
       

        
		

