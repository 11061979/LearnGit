package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();

		// Disable the search engine choice screen
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		// Disable the first-run welcome page
		chromeOptions.addArguments("--no-first-run");
		// Disable the default browser check
		chromeOptions.addArguments("--no-default-browser-check");
		// Disable notifications
		chromeOptions.addArguments("--disable-notifications");
		// Set language to English
		chromeOptions.addArguments("--lang=en-US");
		//WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		// ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.abv.bg");
		// String a = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
