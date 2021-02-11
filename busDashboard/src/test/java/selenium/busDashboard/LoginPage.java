package selenium.busDashboard;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.junit.Assert;
import pom.BaseClass;

public class LoginPage {
	WebDriver driver;
	//WebElement email , password;
	
	@BeforeTest
	public void openURL() {
		BaseClass BC = new BaseClass();
		BC.openURL();
		driver = BaseClass.getWebDriver();
	}

	@Test
	public void loginFun() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/input[1]")).sendKeys("admin@test.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/input[2]")).sendKeys("eslam");
		WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/center/div/div/div/form/button[2]"));
		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0 , 250)");
		login_btn.click();
		
		String expextedURL= driver.getCurrentUrl();
		String actualURL="https://bus.lutfiapp.com/";
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.urlMatches(expextedURL));
		System.out.println(expextedURL);
		Assert.assertEquals(actualURL , expextedURL);	
	}
	
//	@DataProvider
//	public String[][] testData() throws InvalidFormatException, IOException{
//		read_excel_data obj = new read_excel_data();
//		return obj.read_sheet();
//		
//	}

	
	
	
//	@AfterTest
//	public void closeURL() {
//		driver.close();
//	}
}
