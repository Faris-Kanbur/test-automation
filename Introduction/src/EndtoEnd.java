import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		Thread.sleep(2000);
		
		// Bunu her zaman sevmiyorlar o  yüzden parent child Xpath kullanmak daha iyi gibiörnek asagida
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		// (//li[@class='ui-menu-item'])[3] => bir önceki derste yaptihimizin örnegi
		
		Thread.sleep(3000);
		
		List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option : options) 
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}		
		}
		
		
		//kutunun check dilip edilmedigini de true false ile kontrol et
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
		// count number of checkboxes
				
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		// dropdown wýth select tag
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
			
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
				
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
				
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());


		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click( );		
		Thread.sleep(2000L);
		
		// for(int i = 1; i<5; i++)
		
		int i = 1;
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		} 
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

	
		
	
		private static void whihe(boolean b) {
		// TODO Auto-generated method stub
	
}

}
