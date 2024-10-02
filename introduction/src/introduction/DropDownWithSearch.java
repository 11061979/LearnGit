package introduction;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownWithSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		//Assert.assertFalse(driver.findElement(By.id("autosuggest")).isDisplayed());

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				System.out.println(option.getText());
				option.click();
				break;
			}
		}

	}

}
