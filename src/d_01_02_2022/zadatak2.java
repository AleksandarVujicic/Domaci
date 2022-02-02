package d_01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait waitForVideo = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.manage().window().maximize();
		driver.navigate().to("https://videojs.com/city");

		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")).click();

		boolean clicked;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]"));
			clicked = true;
		} catch (Exception e) {
			clicked = false;
		}

		if (clicked) {
			System.out.println("Play button clicked");
		} else {
			System.out.println("Play button wasn't clicked");
		}

		waitForVideo.until(ExpectedConditions.attributeContains(By.xpath("//button[contains(@class, 'vjs-ended')]"),
				"title", "Replay"));
		boolean videoEnd;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-ended')]"));
			videoEnd = true;
		} catch (Exception e) {
			videoEnd = false;
		}

		if (videoEnd) {
			System.out.println("Video finished.");
		} else {
			System.out.println("Video not finished.");
		}

		

	}

}
