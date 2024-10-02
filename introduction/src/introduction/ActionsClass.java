package introduction;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static <ITesseract> void main(String[] args)
			throws MalformedURLException, IOException, InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		// Thread.sleep(3000);
		// driver.navigate().refresh();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.className("nav-line-1-container"));

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Angel")
				.doubleClick().build().perform();
		a.moveToElement(move).contextClick().perform();

		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

}
