package d_31_01_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");

		List<WebElement> elementi = driver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));

		for (int i = 1; i <= elementi.size(); i++) {
			driver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
			Thread.sleep(1500);
			List<WebElement> brisanjaElemenata = driver
					.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));
			if (brisanjaElemenata.size() == elementi.size() - i) {
				System.out.println("Element " + i + " deleted");
			} else {
				System.out.println("Element not deleted");
			}
		}
		driver.close();
	}

}
