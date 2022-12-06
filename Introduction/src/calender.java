import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		System.out.println(driver.getTitle());
		
		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,800)");

		// Click on the Date field

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();

		//WebElement month = driver.findElement(By.xpath("//div[@class='flatpickr-current-month']"));

		//WebElement month = driver.findElement(By.xpath("//span[@class='cur-month']"));

		while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("April"))
			
		{

		Thread.sleep(2000);

		     driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

		}

		List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));

		//grab common attribute and iterate

		int count= driver.findElements(By.className("flatpickr-day")).size();

		for (int i=0;i<count; i++)

		{

		String text= driver.findElements(By.className("flatpickr-day")).get(i).getText();

		if (text.equalsIgnoreCase("20"))

		{

		driver.findElements(By.className("flatpickr-day")).get(i).click();

		break;

		}

		}
		
		

		}



		}

