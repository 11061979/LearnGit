package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BackMaximiseMinimize {

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

		driver.get("http://google.com");
		Thread.sleep(1500);

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1500);
		driver.manage().window().minimize();
		driver.manage().window().maximize();



		driver.navigate().back();
		Thread.sleep(1500);

		driver.navigate().forward();

	}
}
