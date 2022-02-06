package d_03_02_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> linkovi = driver.findElements(By.xpath("//body/div[2]/div/a"));

		for (int i = 0; i < linkovi.size(); i++) {

		js.executeScript("window.open(arguments[0])", linkovi.get(i));

		}

	}

}
