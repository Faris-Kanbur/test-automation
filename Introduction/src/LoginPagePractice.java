import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		//driver.switchTo().alert().accept();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));

		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		//driver.findElement(By.cssSelector("select.form-control")).click();
		//driver.findElement(By.xpath("//option[@value='stud']")).click();
		
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("stud");
		
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		
		//------------------------------------------------------------
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-item active']")));
		
		List<WebElement> products = driver.findElements(By.className("btn-info"));
		

		for(int i = 0; i < products.size(); i++)
		{
			products.get(i).click();
	
		}
		

		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
		//------------------------------------------------------------

		
		
		
		
		
	}

}
