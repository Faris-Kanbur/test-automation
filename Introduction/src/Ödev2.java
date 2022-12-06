import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ödev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("faris25kanbur@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();

		driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).isSelected();

		Assert.assertTrue(driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).isSelected());
		
		// asagidaki ikiside ayni
		
		//option[contains(text(),'Male')]
		//select[@id='exampleFormControlSelect1']//option[1]
		//select[@id='exampleFormControlSelect1'])[1]//option[1]
		
		driver.findElement(By.xpath("//option[contains(text(),'Female')]")).click();
		
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.cssSelector("#inlineRadio1")).isSelected();
		Assert.assertTrue(driver.findElement(By.cssSelector("#inlineRadio1")).isSelected());
		
		// div[class='form-group'] input[name='name']
	    // input[name='bday']
		//input[@name='bday']
		
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("01/01/1993");
		
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
		

	}

}
