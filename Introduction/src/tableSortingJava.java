import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tableSortingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column
		// capture all webElemnts into list
		// capture text of all webelemnt into new(orginal) list
		// sort in the orginal list of step 3 -> sorted list
		// conpare orginal list vs sorted list

		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = elementList.stream().map(element -> element.getText()).collect(Collectors.toList());
	
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		// scan the name column with getText -> Beans -> get the price of the vegetable
		
		List<String>price;
		
		do {	
			// when you change the page you need new column again
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(element -> element.getText().contains("Rice"))
					.map(element -> getPriceVeggie(element)).collect(Collectors.toList());
			
			price.forEach(a-> System.out.println(a));
			
		    if(price.size()< 1) {
			  driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		    }
		}
		while(price.size()<1);
		
	}

	private static String getPriceVeggie(WebElement element) {
		// TODO Auto-generated method stub
		String priceValue = element.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
