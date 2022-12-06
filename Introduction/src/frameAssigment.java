import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		//driver.findElement(By.linkText("Nested Frames")).click();
		//a[href='/nested_frames'] =>> you can use also that way to reach it
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		// driver.switchTo().frame("frame-top");
		WebElement childFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(childFrame);
		
		//driver.switchTo().frame("frame-middle");
		WebElement childChilFrame = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(childChilFrame);

		String text = driver.findElement(By.xpath("//div[@id='content']")).getText();
		
		System.out.print(text);



		

	}

}
