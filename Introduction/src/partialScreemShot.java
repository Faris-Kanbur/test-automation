import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialScreemShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//to open new Tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//get TabsWindows id
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWinbdowId = it.next();
		String childWindowsIs = it.next();
		
		driver.switchTo().window(childWindowsIs);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElement(By.cssSelector("a[href$='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).getText();
		
		driver.switchTo().window(parentWinbdowId);
		
		//Partial Screenshot
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		
		name.sendKeys(courseName);
		File srcFile = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("logo.png"));
		
		// Get Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());


	}

}
