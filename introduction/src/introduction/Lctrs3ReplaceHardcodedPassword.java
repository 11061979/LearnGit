package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class Lctrs3ReplaceHardcodedPassword {

	public static void main(String[] args) throws InterruptedException {
		String name = "Anguel";
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-search-engine-choice-screen");
		chromeOptions.addArguments("--no-first-run");
		chromeOptions.addArguments("--no-default-browser-check");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(chromeOptions);
		//WebDriver driver = new SafariDriver(); 
		//WebDriver driver = new EdgeDriver(); 
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new OperaDriver(); not installed




		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //getPassword() opens the web page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String password = getPassword(driver);
		driver.findElement(By.className("go-to-login-btn")).click();

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1500);

		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(1500);
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		passwordArray[1].split("'");
		String[] passwordArray2 =passwordArray[1].split("'");
		String password = passwordArray2[0];
		return password;
		
		



		
	}

}