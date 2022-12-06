import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeMultipleWindowa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//to open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//get TabsWindows id
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWinbdowId = it.next();
		String childWindowsIs = it.next();
		
		driver.switchTo().window(childWindowsIs);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElement(By.cssSelector("a[href$='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).getText();
		
		driver.switchTo().window(parentWinbdowId);
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		
		driver.quit();

	}

}
