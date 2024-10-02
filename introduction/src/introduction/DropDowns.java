package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		String name = "Anguel";
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1500);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		// Thread.sleep(3000);
		// driver.findElement(By.id("divpaxinfo")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.id("divpaxinfo")).click();
		// dropdown.selectByVisibleText("ADULT");
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		// Thread.sleep(3000);
		// 
		System.out.println("ggg");
		System.out.println(driver.findElement(By.id("btnclosepaxoption")).getText());

		driver.findElement(By.id("btnclosepaxoption")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.id("btnclosepaxoption")).click();

	}
}
