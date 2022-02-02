package d_31_01_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://geodata.solutions/");

		Select dropdownCountry = new Select(driver.findElement(By.name("country")));
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		
		dropdownCountry.selectByVisibleText("Spain");
		Thread.sleep(2000);
		dropdownState.selectByVisibleText("Valencia");
		Thread.sleep(2000);
		dropdownCity.selectByVisibleText("Valencia");
		Thread.sleep(2000);
		driver.close();
	}

}
