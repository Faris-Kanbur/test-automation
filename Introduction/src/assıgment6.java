import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class assýgment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String textOption = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		
		//1. yol
		driver.findElement(By.id("dropdown-class-example")).click();
		
		List<WebElement> myOptions = driver.findElements(By.tagName("option"));
		
		
		for (int i = 0; i < myOptions.size(); i++)
		{
			
			String name = myOptions.get(i).getText();

			if(name == textOption)
			{
				myOptions.get(i).click();

			}
		}	
		
		//2.yol 
		
		// WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        // Select s=new Select(dropdown);

        // s.selectByVisibleText(opt);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(textOption);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		// 1- yol
		alertText.contains(textOption);
		
		Assert.assertTrue(alertText.contains(textOption));
		
		
		// 2.yol
		
		if(alertText.contains(textOption))

		{

		System.out.println("Alert message success");

		}

		else

		System.out.println("Something wrong with execution");

		}


		

	}

}
