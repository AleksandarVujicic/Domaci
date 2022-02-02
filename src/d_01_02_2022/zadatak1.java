package d_01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//button[contains(@class, 'language')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class, 'language')]")).click();

		boolean language;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]")));
			driver.findElement(By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]"));

			language = true;

		} catch (Exception e) {

			language = false;
		}

		if (language) {

			System.out.println("Dijalog prikazan");

		} else {

			System.out.println("Dijalog nije prikazan");
		}

	}

}
