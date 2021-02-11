package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
static WebDriver driver;

	public void openURL() {
		//System.out.println("driver is opened");
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://console.altawasol.app/");
		
		driver.manage().window().maximize();
	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public void closeURL() {
		driver.close();
	}
	public static WebDriver getClose() {
		return driver;
	}
}
