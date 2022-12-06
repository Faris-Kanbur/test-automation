import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(1);
		//driver.findElements(By.tagName("ifrane")).size();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		Actions drop = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		drop.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
	}

}
