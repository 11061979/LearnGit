package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IterateManyButtons {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{
				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}
}

//Added explicit wait
/*
 * WebDriverWait w =new WebDriverWait(driver,5);
 * 
 * 
 * 
 * String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
 * 
 * 
 * 
 * 
 * 
 * driver.get("https://rahulshettyacademy.com/seleniumPractise/");
 * 
 * Thread.sleep(3000);
 * 
 * addItems(driver,itemsNeeded);
 * 
 * driver.findElement(By.cssSelector("img[alt='Cart']")).click();
 * 
 * driver.findElement(By.
 * xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
 * 
 * w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
 * "input.promoCode")));
 * 
 * 
 * 
 * driver.findElement(By.cssSelector("input.promoCode")).sendKeys(
 * "rahulshettyacademy");
 * 
 * driver.findElement(By.cssSelector("button.promoBtn")).click();
 * 
 * //explicit wait
 * 
 * 
 * 
 * w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
 * "span.promoInfo")));
 * 
 * System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).
 * getText());
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * public static void addItems(WebDriver driver,String[] itemsNeeded)
 * 
 * {
 * 
 * int j=0;
 * 
 * List<WebElement>
 * products=driver.findElements(By.cssSelector("h4.product-name"));
 * 
 * for(int i=0;i<products.size();i++)
 * 
 * {
 * 
 * //Brocolli - 1 Kg
 * 
 * //Brocolli, 1 kg
 * 
 * String[] name=products.get(i).getText().split("-");
 * 
 * String formattedName=name[0].trim();
 * 
 * //format it to get actual vegetable name
 * 
 * //convert array into array list for easy search
 * 
 * // check whether name you extracted is present in arrayList or not-
 * 
 * List itemsNeededList = Arrays.asList(itemsNeeded);
 * 
 * if(itemsNeededList.contains(formattedName))
 * 
 * {
 * 
 * j++;
 * 
 * //click on Add to cart
 * 
 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
 * .click();
 * 
 * if(j==itemsNeeded.length)
 * 
 * {
 * 
 * break;
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * }
 */