package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

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
		driver.findElement(By.id("inputUsername")).sendKeys("anguel");
		driver.findElement(By.name("inputPassword")).sendKeys("anguel");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nika");
		// driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Dana");
		// driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Dana@abg.com");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("dana@abc.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678");
		Thread.sleep(1000);
		// System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		// driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("nika");
		// Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);

		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();

		// driver.close();

	}

}