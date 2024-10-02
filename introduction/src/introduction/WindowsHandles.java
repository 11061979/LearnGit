package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> it = windows.iterator();
		// System.out.println(it.hashCode());
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		// Thread.sleep(8000);
		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(text);
		// driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		System.out.println(emailID);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);

		Thread.sleep(9000);
		driver.quit();

	}

}
