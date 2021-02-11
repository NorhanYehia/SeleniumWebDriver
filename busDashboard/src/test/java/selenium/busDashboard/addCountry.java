package selenium.busDashboard;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;

public class addCountry {


	WebDriver driver;

//	@BeforeTest
//
//	public void openURL() {
//		System.setProperty("webdriver.chrome.driver", 
//				System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.navigate().to("https://console.altawasol.app/");
//		
//		driver.manage().window().maximize();
//	}

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://console.altawasol.app/");
		
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/input[1]")).sendKeys("admin@test.com");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/input[2]")).sendKeys("eslam");
//		WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/button[2]"));
//		login_btn.click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/center/div/div[2]/div[1]/div/input")).sendKeys("abdo");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/center/div/div[2]/div[2]/div/input")).sendKeys("123");
		WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/center/div/div[2]/div[3]/div/button"));
		login_btn.click();
//		Timeouts time =  driver.manage().timeouts();
//		time.pageLoadTimeout(8, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());

		String actualUrl="https://console.altawasol.app/home";
		String expectedUrl= driver.getCurrentUrl();

		
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}

//		@Test(priority = 2)
//		public void Add_Country() {
//			
//			//WebElement country = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/ul/li[2]/ul/li[1]/a"));
//			//country.click();
//			
//		}

	//	@AfterTest
	//	public void closeURL() {
	//		driver.close();
	//	}


}
