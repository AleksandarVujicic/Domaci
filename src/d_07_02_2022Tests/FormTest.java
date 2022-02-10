package d_07_02_2022Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import d_07_02_2022Pages.FormPage;

public class FormTest {

	private WebDriver driver;
	private WebDriverWait wait;
	private FormPage formPage;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void BeforeMethod() {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
		driver.get("file:///C:/Users/ThinkPad%20T460s/Desktop/form.html");
		driver.manage().window().maximize();
		
		formPage = new FormPage(driver, wait);
	}
	@Test
	 public void formTest () throws InterruptedException {
		
		formPage.getFirstName().sendKeys("Aleksnadar Vujicic");
		formPage.getGenderRadioButton("Male").click();
		formPage.getDateOfBirth().sendKeys("05.09.1993");
		formPage.getEmail().sendKeys("aleksandar9933@hotmail.com");
		formPage.getRole("QA");
		formPage.getCheckboxInput("Read Books").click();
		formPage.getSubmitButton().click();
		Thread.sleep(1500);
		Assert.assertTrue(formPage.isFormSaved(), "form is not saved");
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}
}
