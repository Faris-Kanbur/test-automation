import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		// Sibling - Child to  parent traverse
		// header/div/button[1]/following-sibling::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// asagidaki ikisi ayni yollar birisinde child to parent digerinde parent to child
		// bir asagidakinde  followong sibling yerinde direkt button[2] de yazabilirdik iki asagidaki örnekte childen parente girderken yaptigimiz gibi
		String nameOfbutton = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(nameOfbutton);
		
		String nameOfbutton2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(nameOfbutton2);
		
	}

}
