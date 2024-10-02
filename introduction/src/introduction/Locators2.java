package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "Anguel";

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
		// WebDriver driver = new ChromeDriver(chromeOptions);
		// WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// String a = driver.getTitle();
		// System.out.println(a);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}