import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\faris\\OneDrive\\Masaüstü\\Selenýum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			// format name to get actual vegetable name
			String[] name = products.get(i).getText().split("-");
			// etrafindaki boslugu almak icin trim() kullandik
			String formatedName = name[0].trim();

			// convert array into arrray list for each search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			// check whether name you extracted is present in arrayList or not

			if (itemsNeededList.contains(formatedName)) {
				// Not asagida 'ADD TO CART' yazdik ama texte güvenme degisebilir tiklandigi
				// zaman ve buda index hatasina neden olabilir
				// (//button[@type='button'][text()='ADD TO CART'])
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// Not: if you use array list you can not use break;
				// break;

				j++;

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}

	}

}
