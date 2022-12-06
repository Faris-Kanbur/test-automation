import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. Give me the count of links on the page.
		// a

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2-Get the link in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		footerdriver.findElements(By.tagName("a")).size();

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3- Get the link in first column in footer section

		WebElement firstsection = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));

		System.out.println(firstsection.findElements(By.tagName("a")).size());

		// 4-click on each link in the column and check if the pages are opening and get
		// title

		// basliga tiklamayacagumiz icin "1" den baslayacagiz

		for (int i = 1; i < firstsection.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstsection.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			//Thread.sleep(5000L);
			
			
		}// opens all the tabs
		
		
		Set<String> windows = driver.getWindowHandles(); // 4 window
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
		    System.out.println(driver.getTitle());
		}

	}

}
